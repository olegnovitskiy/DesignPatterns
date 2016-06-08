package com.fmdev.patterns.creational.builder.wiki;

/**
 * Created by NIO on 15.04.2016. All rights reserved.
 */
public class ChickenBurger extends Burger {
    public String name() {
        return "ChickenBurger";
    }

    @Override
    public float price() {
        return 50.5f;
    }
}
