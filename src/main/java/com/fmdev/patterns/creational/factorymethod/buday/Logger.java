package com.fmdev.patterns.creational.factorymethod.buday;

interface Logger {
    void logMessage(String message);
    void logError(String message);
    void logVerboseInformation(String message);
}
