package com.fmdev.patterns.structural.adapter.freeman;

/**
 * Created by NIO on 14.04.2016. All rights reserved.
 */
public class DuckTestDrive {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        Turkey turkey = new GobbleTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("The Turkey says...");
        turkey.gobble();
        turkey.fly();

        System.out.println("The Duck says...");
        duckSays(duck);

        System.out.println("The TurkeyAdapter says...");
        duckSays(turkeyAdapter);
    }

    private static void duckSays(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
