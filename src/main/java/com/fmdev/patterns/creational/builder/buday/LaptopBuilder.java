package com.fmdev.patterns.creational.builder.buday;

/**
 * Created by NIO on 14.04.2016. All rights reserved.
 */
public abstract class LaptopBuilder {
    protected Laptop laptop;

    public Laptop getMyLaptop() {
        return laptop;
    }

    public void createNewLaptop() {
        laptop = new Laptop();
    }

    public abstract void setMonitorResolution();
    public abstract void setProcessor();
    public abstract void setMemory();
    public abstract void setHDD();
    public abstract void setBattery();
}
