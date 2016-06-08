package com.fmdev.patterns.creational.builder.wiki;

abstract class ColdDrink implements Item {
    public Packing packing() {
        return new Bottle();
    }

    public abstract float price();
}
