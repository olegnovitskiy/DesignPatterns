package com.fmdev.patterns.structural.bridge.buday;

class BrickWallCreator implements WallCreator {
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
