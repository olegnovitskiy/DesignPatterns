package com.fmdev.patterns.structural.facade.buday;

/**
 * Created by NIO on 14.04.2016. All rights reserved.
 */
public class SkiResortTest {
    public static void main(String[] args) {
        SkiResortFacade facade = new SkiResortFacade();

        int resortPrice = facade.HavingGoodRest(180, 90, 45, 99, 5);
        System.out.println("One day price: " + resortPrice);

        int resortPriceWithOwnSkis = facade.HavingRestWithOwnSkis();
        System.out.println("One day price with own skis: " + resortPriceWithOwnSkis);
    }
}
