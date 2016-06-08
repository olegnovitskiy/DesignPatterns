package com.fmdev.patterns.creational.builder.buday;

/**
 * Created by NIO on 14.04.2016. All rights reserved.
 */
public class GamingLaptopBuilder extends LaptopBuilder {
    @Override
    public void setMonitorResolution() {
        laptop.setMonitorResolution("1900x1200");
    }

    @Override
    public void setProcessor() {
        laptop.setProcessor("Core 2 Duo, 3.2 GHz");
    }

    @Override
    public void setMemory() {
        laptop.setMemory("6144 Mb");
    }

    @Override
    public void setHDD() {
        laptop.setHDD("500 Gb");
    }

    @Override
    public void setBattery() {
        laptop.setBattery("6 lbs");
    }
}
