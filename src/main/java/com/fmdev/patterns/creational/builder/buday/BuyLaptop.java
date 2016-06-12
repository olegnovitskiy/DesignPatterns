package com.fmdev.patterns.creational.builder.buday;

class BuyLaptop {
    private LaptopBuilder builder;

    public void setBuilder(LaptopBuilder builder) {
        this.builder = builder;
    }

    Laptop getLaptop() {
        return builder.getMyLaptop();
    }

    void ConstructLaption() {
        builder.createNewLaptop();
        builder.setMonitorResolution();
        builder.setProcessor();
        builder.setMemory();
        builder.setHDD();
        builder.setBattery();
    }
}
