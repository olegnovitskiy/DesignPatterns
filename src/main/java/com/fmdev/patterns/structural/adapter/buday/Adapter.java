package com.fmdev.patterns.structural.adapter.buday;

/**
 * Created by NIO on 14.04.2016. All rights reserved.
 */

public class Adapter implements NewElectricitySystem {
    private OldElectricSystem adaptee;

    public Adapter(OldElectricSystem adaptee) {
        this.adaptee = adaptee;
    }

    public String matchWideSocket() {
        return adaptee.matchThinSocket();
    }
}
