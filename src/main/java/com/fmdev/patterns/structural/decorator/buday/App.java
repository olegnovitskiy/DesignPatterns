package com.fmdev.patterns.structural.decorator.buday;

/**
 * Created by NIO on 14.04.2016. All rights reserved.
 */
public class App {
    public static void main(String[] args) {
        DecoratorCar doctorsDream = new UnderwaterCar(new AmbulanceCar(new Mersedes()));
        doctorsDream.go();
    }
}
