package com.fmdev.patterns.behavioral.proxy.buday;

import java.util.Random;

/**
 * Created by NIO on 15.04.2016. All rights reserved.
 */
public class RobotBombDefuser {
    private Random random = new Random();
    private final int ROBOTCONFIGUREDWAVELENGTH = 41;
    private boolean connected = false;

    public void connectedWireless(int communicationWaveLength) {
        if (communicationWaveLength == ROBOTCONFIGUREDWAVELENGTH) {
            connected = isConnectedImmitatingConnectivityIssues();
        }
    }

    public boolean isConnected() {
        connected = isConnectedImmitatingConnectivityIssues();
        return connected;
    }

    public boolean isConnectedImmitatingConnectivityIssues() {
        return random.nextInt(10) < 4;
    }

    public void walkStraigtForward(int steps) throws BadOperationException {
        System.out.println("Did " + steps + " steps forward...");
    }

    public void turnRight() throws BadOperationException {
        System.out.println("Turned right...");
    }

    public void turnLeft() throws BadOperationException {
        System.out.println("Turned left...");
    }

    public void defuseBomb() throws BadOperationException {
        System.out.println("Cut red or green or blue wire...");
    }
}
