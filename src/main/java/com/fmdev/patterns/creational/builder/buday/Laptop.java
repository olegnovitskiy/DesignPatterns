package com.fmdev.patterns.creational.builder.buday;

/**
 * Created by NIO on 14.04.2016. All rights reserved.
 */
public class Laptop {
    private String monitorResolution;
    private String processor;
    private String memory;
    private String HDD;
    private String battery;

    public void setMonitorResolution(String monitorResolution) {
        this.monitorResolution = monitorResolution;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getMemory() {
        return memory;
    }

    public String getMonitorResolution() {
        return monitorResolution;
    }

    public String getProcessor() {
        return processor;
    }

    public void setHDD(String HDD) {
        this.HDD = HDD;
    }

    public String getHDD() {
        return HDD;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

    public String getBattery() {
        return battery;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "monitorResolution='" + monitorResolution + '\'' +
                ", processor='" + processor + '\'' +
                ", memory='" + memory + '\'' +
                ", HDD='" + HDD + '\'' +
                ", battery='" + battery + '\'' +
                '}';
    }
}
