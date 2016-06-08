package com.fmdev.patterns.structural.decorator.buday;

/**
 * Created by NIO on 14.04.2016. All rights reserved.
 */
public class UnderwaterCar extends DecoratorCar {
    public UnderwaterCar(Car decoratedCar) {
        super(decoratedCar);
    }

    @Override
    public void go() {
        super.go();
        System.out.println("... Dive!");
    }
}
