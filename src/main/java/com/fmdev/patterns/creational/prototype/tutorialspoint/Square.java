package com.fmdev.patterns.creational.prototype.tutorialspoint;

/**
 * Created by NIO on 14.04.2016. All rights reserved.
 */
public class Square extends Shape {
    public Square() {
        type = "Square";
    }

    @Override
    void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
