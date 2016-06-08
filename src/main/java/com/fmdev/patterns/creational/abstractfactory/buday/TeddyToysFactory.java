package com.fmdev.patterns.creational.abstractfactory.buday;

class TeddyToysFactory implements ToyFactory {
    public Bear getBear() {
        return new TeddyBear();
    }

    public Cat getCat() {
        return new TeddyCat();
    }
}
