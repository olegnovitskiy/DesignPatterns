package com.fmdev.patterns.structural.bridge.wiki;

/**
 * Created by NIO on 15.04.2016. All rights reserved.
 */
public class Circle extends Shape {
    private int x;

    private int y;

    private int radius;

    public Circle(int x, int y, int radius, Drawer drawer) {
        super(drawer);
        setX(x);
        setY(y);
        setRadius(radius);
    }

    @Override
    public void draw() {
        drawer.drawCircle(x, y, radius);
    }

    @Override
    public void enlargeRadius(int multiplier) {
        radius *= multiplier;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getRadius() {
        return radius;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
