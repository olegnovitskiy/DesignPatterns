package com.fmdev.patterns.structural.facade.tutorialspoint;

/**
 * Created by NIO on 14.04.2016. All rights reserved.
 */
public class ShapeMarker {
    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeMarker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawCircle() {
        circle.draw();
    }

    public void drawRectangle() {
        rectangle.draw();
    }

    public void drawSquare() {
        square.draw();
    }
}
