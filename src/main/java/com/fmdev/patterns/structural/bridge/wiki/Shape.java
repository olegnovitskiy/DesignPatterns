package com.fmdev.patterns.structural.bridge.wiki;

/**
 * Created by NIO on 15.04.2016. All rights reserved.
 */
public abstract class Shape {
    protected Drawer drawer;

    protected Shape(Drawer drawer){
        this.drawer = drawer;
    }

    public abstract void draw();

    public abstract void enlargeRadius(int multiplier);
}
