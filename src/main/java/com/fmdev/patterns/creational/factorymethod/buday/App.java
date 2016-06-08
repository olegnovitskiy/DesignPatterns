package com.fmdev.patterns.creational.factorymethod.buday;

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
