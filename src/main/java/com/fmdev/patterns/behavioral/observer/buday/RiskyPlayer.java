package com.fmdev.patterns.behavioral.observer.buday;

/**
 * Created by NIO on 15.04.2016. All rights reserved.
 */
public class RiskyPlayer implements Observer {
    private String boxerToPutMoneyOn;

    public String getBoxerToPutMoneyOn() {
        return boxerToPutMoneyOn;
    }

    public void setBoxerToPutMoneyOn(String boxerToPutMoneyOn) {
        this.boxerToPutMoneyOn = boxerToPutMoneyOn;
    }

    public void update(Subject subject) {
        BoxFight fight = (BoxFight) subject;
        if (fight.getBoxerAScore() > fight.getBoxerBScore()) {
            boxerToPutMoneyOn = "I put my money on boxer B. If he will win I get more!";
        }
        else {
            boxerToPutMoneyOn = "I put my money on boxer A. If he will win I get more!";
        }

        System.out.println("RiskyPlayer: " + boxerToPutMoneyOn);
    }
}
