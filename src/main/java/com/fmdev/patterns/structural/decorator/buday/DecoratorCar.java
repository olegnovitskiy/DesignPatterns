package com.fmdev.patterns.structural.decorator.buday;

/**
 * Created by NIO on 14.04.2016. All rights reserved.
 */
public class DecoratorCar extends Car {
    private Car decoratedCar;

    public DecoratorCar(Car decoratedCar) {
        this.decoratedCar = decoratedCar;
    }

    @Override
    public void go() {
        decoratedCar.go();
    }

    public Car getDecoratedCar() {
        return decoratedCar;
    }

    public void setDecoratedCar(Car decoratedCar) {
        this.decoratedCar = decoratedCar;
    }
}
