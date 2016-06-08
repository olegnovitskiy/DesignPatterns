package com.fmdev.patterns.creational.builder.wiki;

/**
 * Created by NIO on 15.04.2016. All rights reserved.
 */
public interface Item {
    public String name();
    public Packing packing();
    public float price();
}
