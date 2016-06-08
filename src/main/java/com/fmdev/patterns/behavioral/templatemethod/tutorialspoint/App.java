package com.fmdev.patterns.behavioral.templatemethod.tutorialspoint;

/**
 * Created by NIO on 15.04.2016. All rights reserved.
 */
public class App {
    public static void main(String[] args) {
        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}
