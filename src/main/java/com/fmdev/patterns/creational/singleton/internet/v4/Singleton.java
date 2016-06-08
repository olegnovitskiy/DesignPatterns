package com.fmdev.patterns.creational.singleton.internet.v4;

class Singleton {
    private static volatile Singleton instance;
    private String message;

    // 2 Double Checked Locking & volatile
    public static Singleton getInstance() {
        Singleton localInstance = instance;
        if (localInstance == null) {
            synchronized (Singleton.class) {
                localInstance = instance;
                if (localInstance == null) {
                    instance = localInstance = new Singleton();
                }
            }
        }
        return localInstance;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
