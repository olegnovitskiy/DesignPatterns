package com.fmdev.patterns.creational.prototype.tutorialspoint;

/**
 * Created by NIO on 14.04.2016. All rights reserved.
 */
public class Circle extends Shape {
    public Circle() {
        type = "Circle";
    }

    @Override
    void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
