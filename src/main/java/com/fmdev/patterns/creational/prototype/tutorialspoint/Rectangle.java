package com.fmdev.patterns.creational.prototype.tutorialspoint;

class Rectangle extends Shape {
    Rectangle() {
        type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
