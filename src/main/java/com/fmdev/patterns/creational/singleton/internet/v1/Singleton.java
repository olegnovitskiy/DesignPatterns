package com.fmdev.patterns.creational.singleton.internet.v1;

class Singleton {
    private String message;

    static final Singleton INSTANCE = new Singleton();

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
