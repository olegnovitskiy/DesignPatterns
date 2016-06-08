package com.fmdev.patterns.creational.prototype.tutorialspoint;

class Square extends Shape {
    Square() {
        type = "Square";
    }

    @Override
    void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
