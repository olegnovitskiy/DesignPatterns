package com.fmdev.patterns.structural.adapter.freeman;

/**
 * Created by NIO on 14.04.2016. All rights reserved.
 */
public class GobbleTurkey implements Turkey {
    public void gobble() {
        System.out.println("Gobble, gobble");
    }

    public void fly() {
        System.out.println("I'm flying a short distance");
    }
}
