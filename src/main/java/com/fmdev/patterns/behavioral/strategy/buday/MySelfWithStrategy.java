package com.fmdev.patterns.behavioral.strategy.buday;

/**
 * Created by NIO on 14.04.2016. All rights reserved.
 */

public class MySelfWithStrategy {
    private WearingStrategy strategy = new DefaultWearingStrategy();

    public void changeStrategy(WearingStrategy strategy) {
        this.strategy = strategy;
    }

    public void goOutside() {
        String clothes = strategy.getClothes();
        String accessories = strategy.getAccessories();
        System.out.println("Today I wore " + clothes + " and took " + accessories);
    }
}
