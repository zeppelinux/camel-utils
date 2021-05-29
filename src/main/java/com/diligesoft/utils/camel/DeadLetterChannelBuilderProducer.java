package com.diligesoft.utils.camel;

import org.apache.camel.Exchange;
import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.DeadLetterChannelBuilder;
import org.apache.camel.builder.DefaultErrorHandlerBuilder;
import org.apache.camel.jta.JtaTransactionErrorHandlerBuilder;
import org.apache.camel.processor.errorhandler.RedeliveryPolicy;
import org.jboss.logging.Logger;

import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.Annotated;
import javax.enterprise.inject.spi.InjectionPoint;
import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class DeadLetterChannelBuilderProducer {

    @Inject
    Logger logger;

    @Inject
    ExceptionEnricher enricher;

    @Produces
    @ErrorHandler
    public DefaultErrorHandlerBuilder mixErrorHandler(InjectionPoint injectionPoint) {

        Annotated annotated = injectionPoint.getAnnotated();
        ErrorHandler annotation = annotated.getAnnotation(ErrorHandler.class);

        DefaultErrorHandlerBuilder deadLetterChannelBuilder;
        if (annotation.transactional()) {
            deadLetterChannelBuilder = new JtaTransactionErrorHandlerBuilder();
            ((JtaTransactionErrorHandlerBuilder) deadLetterChannelBuilder).setTransactionPolicy(annotation.transactionPolicy());
        } else {
            deadLetterChannelBuilder = new DeadLetterChannelBuilder();
        }


        deadLetterChannelBuilder.setDeadLetterUri(annotation.deadLetterUri());

        if (annotation.redeliveryPolicy() == RedeliveryPolicyEnum.DISABLED) {
            deadLetterChannelBuilder.setRedeliveryPolicy(new RedeliveryPolicy().disableRedelivery());
        } else {
            deadLetterChannelBuilder.setRedeliveryPolicy(new RedeliveryPolicy()
                    .logExhausted(true)
                    .maximumRedeliveries(annotation.maximumRedeliveries())
                    .redeliveryDelay(annotation.redeliveryDelay())
                    .retryAttemptedLogLevel(LoggingLevel.TRACE)
                    .backOffMultiplier(annotation.backoffMultiplier())
                    .maximumRedeliveryDelay(annotation.maximumRedeliveryDelay())
                    .backOffMultiplier(annotation.backoffMultiplier()));

            if (annotation.useExponentialBackOff()) {
                deadLetterChannelBuilder.useExponentialBackOff();
            }
        }

        deadLetterChannelBuilder.onPrepareFailure(enricher);

        if (annotation.useOriginalMessage()) {
            deadLetterChannelBuilder.useOriginalMessage();
        }

        deadLetterChannelBuilder.loggingLevel(annotation.loggingLevel());

        deadLetterChannelBuilder.logExhaustedMessageHistory(true);
        deadLetterChannelBuilder.logExhaustedMessageBody(true);
        deadLetterChannelBuilder.logNewException(true);
        deadLetterChannelBuilder.logStackTrace(true);
        deadLetterChannelBuilder.allowRedeliveryWhileStopping(true);
        deadLetterChannelBuilder.onExceptionOccurred(e -> logger.error("processing failed with:", e.getException()));
        deadLetterChannelBuilder.onRedelivery(exchange -> logger.warn(String.format("redelivery attempt %d to %s",
                exchange.getIn().getHeader(Exchange.REDELIVERY_COUNTER, Integer.class),
                exchange.getProperty(Exchange.TO_ENDPOINT, String.class))));
        return deadLetterChannelBuilder;
    }
}
