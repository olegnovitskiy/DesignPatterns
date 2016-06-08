package com.fmdev.patterns.structural.decorator.buday;

/**
 * Created by NIO on 14.04.2016. All rights reserved.
 */
public class Car {
    protected String brandName;

    public void go() {
        System.out.printf("I'm " + brandName + " I'm go away!");
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }
}
