package com.fmdev.patterns.creational.abstractfactory.buday;

/**
 * Created by NIO on 14.04.2016. All rights reserved.
 */
public class WoodenToysFactory implements ToyFactory {
    public Bear getBear() {
        return new WoodenBear();
    }

    public Cat getCat() {
        return new WoodenCat();
    }
}
