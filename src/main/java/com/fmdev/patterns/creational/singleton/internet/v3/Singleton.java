package com.fmdev.patterns.creational.singleton.internet.v3;

class Singleton {
    private static Singleton instance;
    private String message;

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
