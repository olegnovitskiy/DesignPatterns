package com.fmdev.patterns.structural.adapter.freeman;

/**
 * Created by NIO on 14.04.2016. All rights reserved.
 */
public class MallardDuck implements Duck {
    public void quack() {
        System.out.println("Quack");
    }

    public void fly() {
        System.out.println("I'm flying");
    }
}
