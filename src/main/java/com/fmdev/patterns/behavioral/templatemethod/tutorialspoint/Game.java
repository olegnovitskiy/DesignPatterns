package com.fmdev.patterns.behavioral.templatemethod.tutorialspoint;

/**
 * Created by NIO on 15.04.2016. All rights reserved.
 */
public abstract class Game {
    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

    //template method
    public final void play(){

        //initialize the game
        initialize();

        //start game
        startPlay();

        //end game
        endPlay();
    }
}
