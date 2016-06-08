package com.fmdev.patterns.creational.factorymethod.buday;

class EnterpriseLogger implements Logger {
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
