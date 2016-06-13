package com.fmdev.patterns.structural.bridge.buday;

class ConcreteWallCreator implements WallCreator {
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
