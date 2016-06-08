package com.fmdev.patterns.structural.adapter.buday;

public class AdapteeDemo {
    public static void main(String[] args) {
        ElectricityConsumer.chargeNotebook(new NewElectricitySystemImpl());

        OldElectricSystem oldElectricitySystem = new OldElectricSystem();
        Adapter adapter = new Adapter(oldElectricitySystem);
        ElectricityConsumer.chargeNotebook(adapter);
    }
}
