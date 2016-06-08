package com.fmdev.patterns.creational.factorymethod.buday;

class LoggerProviderFactory {
    static Logger getLoggingProvider(LoggingProvider provider) {
        switch (provider) {
            case LOG4J:
                return new Log4jLogger();
            case ENTERPRISE:
                return new EnterpriseLogger();
            default:
                return new EnterpriseLogger();
        }
    }
}
