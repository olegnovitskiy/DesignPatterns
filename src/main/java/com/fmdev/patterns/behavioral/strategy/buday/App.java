package com.fmdev.patterns.behavioral.strategy.buday;

/**
 * Created by NIO on 14.04.2016. All rights reserved.
 */
public class App {
    public static void main(String[] args) {

//        MySelf me = new MySelf();
//        me.goOutside();

        MySelfWithStrategy me = new MySelfWithStrategy();
        me.changeStrategy(new SunshineWearingStrategy());
        me.goOutside();
        me.changeStrategy(new RainyWearingStrategy());
        me.goOutside();
    }
}
