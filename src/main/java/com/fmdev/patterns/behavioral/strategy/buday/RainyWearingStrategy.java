package com.fmdev.patterns.behavioral.strategy.buday;

/**
 * Created by NIO on 14.04.2016. All rights reserved.
 */
public class RainyWearingStrategy implements WearingStrategy {
    public String getClothes() {
        return "Coat";
    }

    public String getAccessories() {
        return "Umbrella";
    }
}
