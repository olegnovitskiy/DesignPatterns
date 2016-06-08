package com.fmdev.patterns.creational.abstractfactory.buday;

/**
 * Created by NIO on 14.04.2016. All rights reserved.
 */
public abstract class AnimalToy {
    private String name;

    public AnimalToy(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
