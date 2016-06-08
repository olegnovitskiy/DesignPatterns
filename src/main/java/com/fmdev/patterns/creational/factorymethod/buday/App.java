package com.fmdev.patterns.creational.factorymethod.buday;

/**
 * Created by NIO on 14.04.2016. All rights reserved.
 */
public class App {
    public static void main(String[] args) {
        LoggingProvider providerType = getTypeOfLoggingProviderFromFile();
        Logger logger = LoggerProviderFactory.getLoggingProvider(providerType);
        logger.logMessage("Hello from App");
    }

    private static LoggingProvider getTypeOfLoggingProviderFromFile() {
        return LoggingProvider.LOG4J; // Hardcoded for example simplification
    }
}
