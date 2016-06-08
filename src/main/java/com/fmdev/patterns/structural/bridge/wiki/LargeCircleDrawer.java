package com.fmdev.patterns.structural.bridge.wiki;

/**
 * Created by NIO on 15.04.2016. All rights reserved.
 */
public class LargeCircleDrawer implements Drawer {
    public static final int radiusMultiplier = 10;

    public void drawCircle(int x, int y, int radius) {
        System.out.println("Large circle center = " + x + "," + y + " radius = " + radius*radiusMultiplier);
    }
}
