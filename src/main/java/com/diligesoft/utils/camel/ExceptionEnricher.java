package com.diligesoft.utils.camel;

import org.apache.camel.CamelExecutionException;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.jboss.logging.Logger;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

@Singleton
public class ExceptionEnricher implements Processor {

    @Inject
    Logger logger;

    public void process(Exchange exchange) {

        logger.info("preparing error message..");
        exchange.getMessage().setBody(exchange.getIn().getBody());

        Throwable ex = exchange.getException();

        if (ex == null) {
            ex = exchange.getProperty(Exchange.EXCEPTION_CAUGHT, Exception.class);
        }

        if (ex instanceof CamelExecutionException) {
            Throwable cause = getCause(ex);
            if (cause != null) {
                ex = cause;
            }
        }

        exchange.setProperty(Exchange.EXCEPTION_CAUGHT, ex);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        getCause(ex).printStackTrace(ps);

        exchange.getMessage().setHeaders(exchange.getIn().getHeaders());
        exchange.getMessage().setHeader("stackTrace", baos.toString());
        exchange.getMessage().setHeader("errorMessage", ex.getMessage());
    }

    private Throwable getCause(Throwable e) {
        if (e == null) {
            return new RuntimeException("can't find the real cause exception because there is no exception :(");
        }
        Throwable cause;
        Throwable result = e;

        while (null != (cause = result.getCause()) && (result != cause)) {
            result = cause;
        }
        return result;
    }
}

