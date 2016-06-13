package com.fmdev.patterns.structural.bridge.wiki;

class LargeCircleDrawer implements Drawer {
    static final int radiusMultiplier = 10;

    public void drawCircle(int x, int y, int radius) {
        System.out.println("Large circle center = " + x + "," + y + " radius = " + radius*radiusMultiplier);
    }
}
