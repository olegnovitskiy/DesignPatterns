package com.fmdev.patterns.structural.adapter.buday;

class Adapter implements NewElectricitySystem {
    private OldElectricSystem adaptee;

    Adapter(OldElectricSystem adaptee) {
        this.adaptee = adaptee;
    }

    public String matchWideSocket() {
        return adaptee.matchThinSocket();
    }
}
