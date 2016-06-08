package com.fmdev.patterns.creational.builder.wiki;

/**
 * Created by NIO on 15.04.2016. All rights reserved.
 */
public abstract class Burger implements Item {
    public Packing packing() {
        return new Bottle();
    }

    public abstract float price();
}
