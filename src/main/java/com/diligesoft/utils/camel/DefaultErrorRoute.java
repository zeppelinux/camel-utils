package com.diligesoft.utils.camel;

import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.ProcessorDefinition;
import org.apache.camel.model.RouteDefinition;
import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class DefaultErrorRoute extends RouteBuilder {

    @Inject
    @ConfigProperty(name = "applicationErrorEndpoint", defaultValue = "none")
    String errorEndpoint;

    public void configure() throws Exception {
        ProcessorDefinition<RouteDefinition> def = from("direct:error")
                .log(LoggingLevel.ERROR, "stacktrace: ${header['stackTrace']}")
                .log("${messageHistory}");

        if (noErrorEndpoint()) {
            def.log("no error endpoint configured");
        } else {
            def.log("sending original message to the " + errorEndpoint).to(errorEndpoint);
        }
    }

    public boolean noErrorEndpoint() {
        return errorEndpoint.equals("none");
    }
}
