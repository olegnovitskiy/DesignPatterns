package com.fmdev.patterns.creational.builder.wiki;

/**
 * Created by NIO on 15.04.2016. All rights reserved.
 */
public class Coke extends ColdDriink {
    @Override
    public float price() {
        return 30.0f;
    }

    public String name() {
        return "Coke";
    }
}
