package com.fmdev.patterns.behavioral.proxy.buday;

/**
 * Created by NIO on 15.04.2016. All rights reserved.
 */
public class RobotBombDefuserProxy extends RobotBombDefuser {
    private RobotBombDefuser robotBombDefuser;
    private int communicationWaveLength;
    private int connectionAttemps = 3;

    public RobotBombDefuserProxy(int communicationWaveLength) {
        robotBombDefuser = new RobotBombDefuser();
        this.communicationWaveLength = communicationWaveLength;
    }

    @Override
    public void walkStraigtForward(int steps) throws BadOperationException {
        ensureConnectedWithRobot();
        robotBombDefuser.walkStraigtForward(steps);
    }

    @Override
    public void turnRight() throws BadOperationException {
        ensureConnectedWithRobot();
        robotBombDefuser.turnRight();
    }

    @Override
    public void turnLeft() throws BadOperationException {
        ensureConnectedWithRobot();
        robotBombDefuser.turnLeft();
    }

    @Override
    public void defuseBomb() throws BadOperationException {
        ensureConnectedWithRobot();
        robotBombDefuser.defuseBomb();
    }

    private void ensureConnectedWithRobot() throws BadOperationException {
        if (robotBombDefuser == null) {
            robotBombDefuser = new RobotBombDefuser();
            robotBombDefuser.connectedWireless(communicationWaveLength);
        }

        for (int i = 0; i < connectionAttemps; i++) {
            if (robotBombDefuser.isConnected()) {
                break;
            }
            robotBombDefuser.connectedWireless(communicationWaveLength);
        }

        if (!robotBombDefuser.isConnected()) {
            throw new BadOperationException("No connection with remote bomb defuser robot could be made after few attemps");
        }
    }
}
