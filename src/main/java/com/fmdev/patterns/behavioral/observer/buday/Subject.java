package com.fmdev.patterns.behavioral.observer.buday;

/**
 * Created by NIO on 15.04.2016. All rights reserved.
 */
public interface Subject {
    void attach(Observer observer);
    void detach(Observer observer);
    void notifyAllObservers();
}
