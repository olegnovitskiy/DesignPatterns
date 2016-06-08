package com.fmdev.patterns.structural.bridge.buday;

/**
 * Created by NIO on 15.04.2016. All rights reserved.
 */
public class BrickWallCreator implements WallCreator {
    public void buildWallWithDoor() {
        System.out.println("Brick wall with door.");
    }

    public void buildWall() {
        System.out.println("Brick wall.");
    }

    public void buildWallWithWindow() {
        System.out.println("Brick wall with window.");
    }
}
