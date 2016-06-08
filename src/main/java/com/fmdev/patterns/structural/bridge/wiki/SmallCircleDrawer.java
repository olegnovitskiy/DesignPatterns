package com.fmdev.patterns.structural.bridge.wiki;

/**
 * Created by NIO on 15.04.2016. All rights reserved.
 */
public class SmallCircleDrawer implements Drawer {
    public static final double radiusMultiplier = 0.25;

    public void drawCircle(int x, int y, int radius) {
        System.out.println("Small circle center = " + x + "," + y + " radius = " + radius*radiusMultiplier);
    }
}
