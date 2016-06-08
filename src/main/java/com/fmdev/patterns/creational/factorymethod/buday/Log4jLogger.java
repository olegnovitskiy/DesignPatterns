package com.fmdev.patterns.creational.factorymethod.buday;

class Log4jLogger implements Logger {
    public void logMessage(String message) {
        System.out.println("Log4j message: " + message);
    }

    public void logError(String message) {
        System.out.println("Log4j error: " + message);
    }

    public void logVerboseInformation(String message) {
        System.out.println("Log4j info: " + message);
    }
}
