package com.fmdev.patterns.creational.factorymethod.buday;

/**
 * Created by NIO on 14.04.2016. All rights reserved.
 */
public class LoggerProviderFactory {
    public static Logger getLoggingProvider(LoggingProvider provider) {
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
