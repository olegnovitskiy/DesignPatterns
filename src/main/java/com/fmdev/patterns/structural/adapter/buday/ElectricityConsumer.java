package com.fmdev.patterns.structural.adapter.buday;

class ElectricityConsumer {
    static void chargeNotebook(NewElectricitySystem electricitySystem) {
        System.out.println(electricitySystem.matchWideSocket());
    }
}
