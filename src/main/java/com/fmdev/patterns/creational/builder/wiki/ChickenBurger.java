package com.fmdev.patterns.creational.builder.wiki;

class ChickenBurger extends Burger {
    public String name() {
        return "ChickenBurger";
    }

    @Override
    public float price() {
        return 50.5f;
    }
}
