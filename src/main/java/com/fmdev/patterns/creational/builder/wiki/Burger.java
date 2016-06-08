package com.fmdev.patterns.creational.builder.wiki;

abstract class Burger implements Item {
    public Packing packing() {
        return new Wrapper();
    }

    public abstract float price();
}
