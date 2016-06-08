package com.fmdev.patterns.creational.prototype.tutorialspoint;

/**
 * Created by NIO on 14.04.2016. All rights reserved.
 */
public class Rectangle extends Shape {
    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
