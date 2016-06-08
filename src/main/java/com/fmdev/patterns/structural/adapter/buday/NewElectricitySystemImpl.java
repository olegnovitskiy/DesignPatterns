package com.fmdev.patterns.structural.adapter.buday;

/**
 * Created by NIO on 14.04.2016. All rights reserved.
 */

public class NewElectricitySystemImpl implements NewElectricitySystem {
    public String matchWideSocket() {
        return "220V";
    }
}
