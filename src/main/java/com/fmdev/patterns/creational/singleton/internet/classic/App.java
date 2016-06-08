package com.fmdev.patterns.creational.singleton.internet.classic;

/**
 * Created by NIO on 14.04.2016. All rights reserved.
 */
public class App {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        singleton1.setMessage("Hello");

        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton2.getMessage());
    }
}
