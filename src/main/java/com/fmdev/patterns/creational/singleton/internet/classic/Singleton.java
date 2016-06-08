package com.fmdev.patterns.creational.singleton.internet.classic;

/**
 * Created by NIO on 14.04.2016. All rights reserved.
 */
public class Singleton {
    private String message;
    private static Singleton instance = new Singleton();

    private Singleton() {}

    public static Singleton getInstance() {
        return instance;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
