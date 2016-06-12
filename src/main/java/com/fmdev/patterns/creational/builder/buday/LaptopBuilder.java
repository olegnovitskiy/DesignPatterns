package com.fmdev.patterns.creational.builder.buday;

abstract class LaptopBuilder {
    private Laptop laptop;

    Laptop getMyLaptop() {
        return laptop;
    }

    void createNewLaptop() {
        laptop = new Laptop();
    }

    public abstract void setMonitorResolution();
    public abstract void setProcessor();
    public abstract void setMemory();
    public abstract void setHDD();
    public abstract void setBattery();
}
