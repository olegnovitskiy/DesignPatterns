package com.fmdev.patterns.creational.builder.wiki;

class Coke extends ColdDrink {
    @Override
    public float price() {
        return 30.0f;
    }

    public String name() {
        return "Coke";
    }
}
