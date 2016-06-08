package com.fmdev.patterns.creational.singleton.internet.v1;

public class App {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.INSTANCE;
        singleton1.setMessage("hello");

        Singleton singleton2 = Singleton.INSTANCE;
        System.out.println(singleton2.getMessage());
    }
}
