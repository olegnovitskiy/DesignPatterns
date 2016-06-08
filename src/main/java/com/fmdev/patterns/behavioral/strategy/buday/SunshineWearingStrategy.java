package com.fmdev.patterns.behavioral.strategy.buday;

/**
 * Created by NIO on 14.04.2016. All rights reserved.
 */
public class SunshineWearingStrategy implements WearingStrategy {
    public String getClothes() {
        return "T-Shirt";
    }

    public String getAccessories() {
        return "sunglasses";
    }
}
