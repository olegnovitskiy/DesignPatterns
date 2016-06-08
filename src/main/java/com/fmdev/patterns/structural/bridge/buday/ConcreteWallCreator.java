package com.fmdev.patterns.structural.bridge.buday;

/**
 * Created by NIO on 15.04.2016. All rights reserved.
 */
public class ConcreteWallCreator implements WallCreator {
    public void buildWallWithDoor() {
        System.out.println("Concrete wall with door.");
    }

    public void buildWall() {
        System.out.println("Concrete wall.");
    }

    public void buildWallWithWindow() {
        System.out.println("Concrete wall with window.");
    }
}
