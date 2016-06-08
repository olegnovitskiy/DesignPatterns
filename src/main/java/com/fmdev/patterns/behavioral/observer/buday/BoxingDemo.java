package com.fmdev.patterns.behavioral.observer.buday;

/**
 * Created by NIO on 15.04.2016. All rights reserved.
 */
public class BoxingDemo {
    public static void main(String[] args) {
        BoxFight boxingFight = new BoxFight();
        RiskyPlayer riskyPlayer = new RiskyPlayer();
        ConservativePlayer conservativePlayer = new ConservativePlayer();

        boxingFight.attach(riskyPlayer);
        boxingFight.attach(conservativePlayer);

        boxingFight.nextRound();
        boxingFight.nextRound();
        boxingFight.nextRound();
        boxingFight.nextRound();
    }
}
