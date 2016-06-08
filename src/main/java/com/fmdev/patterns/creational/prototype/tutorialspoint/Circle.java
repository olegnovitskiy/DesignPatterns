package com.fmdev.patterns.creational.prototype.tutorialspoint;

class Circle extends Shape {
    Circle() {
        type = "Circle";
    }

    @Override
    void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
