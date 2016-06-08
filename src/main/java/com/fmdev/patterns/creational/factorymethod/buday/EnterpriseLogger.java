package com.fmdev.patterns.creational.factorymethod.buday;

/**
 * Created by NIO on 14.04.2016. All rights reserved.
 */
public class EnterpriseLogger implements Logger {
    public void logMessage(String message) {
        System.out.println(message);
    }

    public void logError(String message) {
        System.out.println(message);
    }

    public void logVerboseInformation(String message) {
        System.out.println(message);
    }
}
