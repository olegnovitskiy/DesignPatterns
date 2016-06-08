package com.fmdev.patterns.structural.facade.buday;

/**
 * Created by NIO on 14.04.2016. All rights reserved.
 */

public class SkiRent {
    public int rentBoot(int feetSize, int skierLevel) {
        return 20;
    }

    public int rentSki(int weight, int skierLevel) {
        return 40;
    }

    public int rentPole(int height) {
        return 5;
    }
}
