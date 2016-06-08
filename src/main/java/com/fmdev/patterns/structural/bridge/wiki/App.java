package com.fmdev.patterns.structural.bridge.wiki;

/**
 * Created by NIO on 15.04.2016. All rights reserved.
 */
public class App {
    public static void main (String [] args){
        Shape [] shapes = {
                new Circle(5,10,10, new LargeCircleDrawer()),
                new Circle(20,30,100, new SmallCircleDrawer())};

        for (Shape next : shapes){
            next.draw();
        }
    }
}
