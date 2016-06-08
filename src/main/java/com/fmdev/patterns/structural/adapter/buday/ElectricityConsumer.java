package com.fmdev.patterns.structural.adapter.buday;

/**
 * Created by NIO on 14.04.2016. All rights reserved.
 */

public class ElectricityConsumer {
    public static void chargeNotebook(NewElectricitySystem electricitySystem) {
        System.out.println(electricitySystem.matchWideSocket());
    }
}
