package com.fmdev.patterns.creational.builder.buday;

/**
 * Created by NIO on 14.04.2016. All rights reserved.
 */
public class App {
    public static void main(String[] args) {
        LaptopBuilder tripBuilder = new TripLaptopBuilder();
        LaptopBuilder gamingBuilder = new GamingLaptopBuilder();
        BuyLaptop shopForYou = new BuyLaptop(); // Director

        // Create gaming laptop
        shopForYou.setBuilder(gamingBuilder);
        shopForYou.ConstructLaption();
        Laptop laptop = shopForYou.getLaptop();
        System.out.println(laptop);

        // Create trip laptop
        shopForYou.setBuilder(tripBuilder);
        shopForYou.ConstructLaption();
        laptop = shopForYou.getLaptop();
        System.out.println(laptop);
    }
}
