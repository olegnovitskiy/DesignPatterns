package com.fmdev.patterns.creational.factorymethod.buday;

/**
 * Created by NIO on 14.04.2016. All rights reserved.
 */
public interface Logger {
    void logMessage(String message);
    void logError(String message);
    void logVerboseInformation(String message);
}
