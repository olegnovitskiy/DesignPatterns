package com.fmdev.patterns.creational.builder.buday;

/**
 * Created by NIO on 14.04.2016. All rights reserved.
 */
public class BuyLaptop {
    private LaptopBuilder builder;

    public void setBuilder(LaptopBuilder builder) {
        this.builder = builder;
    }

    public Laptop getLaptop() {
        return builder.getMyLaptop();
    }

    public void ConstructLaption() {
        builder.createNewLaptop();
        builder.setMonitorResolution();
        builder.setProcessor();
        builder.setMemory();
        builder.setHDD();
        builder.setBattery();
    }
}
