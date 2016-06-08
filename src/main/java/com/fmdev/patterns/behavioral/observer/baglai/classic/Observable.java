package com.fmdev.patterns.behavioral.observer.baglai.classic;

/**
 * Created by oleksandr.baglai on 03.09.2015.
 */
public interface Observable {

    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers(Object data);
}
