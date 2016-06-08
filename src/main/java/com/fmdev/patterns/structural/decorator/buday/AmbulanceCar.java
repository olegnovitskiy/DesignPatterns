package com.fmdev.patterns.structural.decorator.buday;

/**
 * Created by NIO on 14.04.2016. All rights reserved.
 */
public class AmbulanceCar extends DecoratorCar {

    public AmbulanceCar(Car decoratedCar) {
        super(decoratedCar);
    }

    @Override
    public void go() {
        super.go();
        System.out.println("... beep, beep, beep!");
    }
}
