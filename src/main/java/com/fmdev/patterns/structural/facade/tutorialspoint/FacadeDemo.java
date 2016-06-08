package com.fmdev.patterns.structural.facade.tutorialspoint;

/**
 * Created by NIO on 14.04.2016. All rights reserved.
 */
public class FacadeDemo {
    public static void main(String[] args) {
        ShapeMarker shapeMarker = new ShapeMarker();

        shapeMarker.drawCircle();
        shapeMarker.drawRectangle();
        shapeMarker.drawSquare();
    }
}
