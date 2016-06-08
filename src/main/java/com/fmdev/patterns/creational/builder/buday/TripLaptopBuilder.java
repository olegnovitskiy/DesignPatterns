package com.fmdev.patterns.creational.builder.buday;

/**
 * Created by NIO on 14.04.2016. All rights reserved.
 */
public class TripLaptopBuilder extends LaptopBuilder {
    @Override
    public void setMonitorResolution() {
        laptop.setMonitorResolution("1200x800");
    }

    @Override
    public void setProcessor() {
        laptop.setProcessor("Intel Celeron 1 GHz");
    }

    @Override
    public void setMemory() {
        laptop.setMemory("2 Gb");
    }

    @Override
    public void setHDD() {
        laptop.setHDD("120 Gb");
    }

    @Override
    public void setBattery() {
        laptop.setBattery("6 lbs");
    }
}
