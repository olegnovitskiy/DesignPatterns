package com.fmdev.patterns.structural.adapter.tutorialspoint;

/**
 * Created by NIO on 14.04.2016. All rights reserved.
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: "+ fileName);
    }

    public void playMp4(String fileName) {
        // do nothing
    }
}
