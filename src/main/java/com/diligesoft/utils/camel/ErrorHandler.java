package com.diligesoft.utils.camel;

import org.apache.camel.LoggingLevel;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static com.diligesoft.utils.camel.RedeliveryPolicyEnum.DISABLED;


@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.TYPE})
public @interface ErrorHandler {

    boolean transactional() default false;

    String transactionPolicy() default "PROPAGATION_SUPPORTS";

    String deadLetterUri() default "direct:error";

    RedeliveryPolicyEnum redeliveryPolicy() default DISABLED;

    boolean useOriginalMessage() default true;

    LoggingLevel loggingLevel() default LoggingLevel.INFO;

    int maximumRedeliveries() default 3;

    int redeliveryDelay() default 1000;

    double backoffMultiplier() default 1.5;

    int maximumRedeliveryDelay() default 3600000;

    boolean useExponentialBackOff() default true;
}
