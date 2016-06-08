package com.fmdev.patterns.creational.builder.wiki;

class Pepsi extends ColdDrink {
    @Override
    public float price() {
        return 35.0f;
    }

    public String name() {
        return "Pepsi";
    }
}
