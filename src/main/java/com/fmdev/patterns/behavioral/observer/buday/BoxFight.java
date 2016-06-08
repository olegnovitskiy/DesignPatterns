package com.fmdev.patterns.behavioral.observer.buday;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by NIO on 15.04.2016. All rights reserved.
 */
public class BoxFight implements Subject {
    private List<Observer> observers;
    private int roundNumber;
    private Random rand = new Random();
    private int boxerAScore;
    private int boxerBScore;

    public BoxFight() {
        observers = new ArrayList<Observer>();
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    public void nextRound() {
        roundNumber++;

        boxerAScore += rand.nextInt(5);
        boxerBScore += rand.nextInt(5);

        System.out.println("boxerAScore: " + boxerAScore + " boxerBScore: " + boxerBScore);

        notifyAllObservers();
    }

    public void setBoxerAScore(int boxerAScore) {
        this.boxerAScore = boxerAScore;
    }

    public void setBoxerBScore(int boxerBScore) {
        this.boxerBScore = boxerBScore;
    }

    public int getRoundNumber() {
        return roundNumber;
    }

    public Random getRand() {
        return rand;
    }

    public int getBoxerAScore() {
        return boxerAScore;
    }

    public int getBoxerBScore() {
        return boxerBScore;
    }

    public List<Observer> getObservers() {
        return observers;
    }
}
