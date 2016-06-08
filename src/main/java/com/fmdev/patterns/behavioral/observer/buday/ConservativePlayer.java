package com.fmdev.patterns.behavioral.observer.buday;

/**
 * Created by NIO on 15.04.2016. All rights reserved.
 */
public class ConservativePlayer implements Observer {
    private String boxerToPutMoneyOn;

    public void update(Subject subject) {
        BoxFight fight = (BoxFight) subject;
        if (fight.getBoxerAScore() < fight.getBoxerBScore()) {
            boxerToPutMoneyOn = "I put my money on boxer B, better be safe!";
        } else {
            boxerToPutMoneyOn = "I put my money on boxer A, better be safe!";
        }

        System.out.println("ConservativePlayer: " + boxerToPutMoneyOn);
    }
}
