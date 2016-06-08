package com.fmdev.patterns.structural.adapter.tutorialspoint;

/**
 * Created by NIO on 14.04.2016. All rights reserved.
 */
public class Mp4Player implements AdvancedMediaPlayer {
    public void playVlc(String fileName) {
        // do nothing
    }

    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: "+ fileName);
    }
}
