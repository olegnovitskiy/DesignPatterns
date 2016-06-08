package com.fmdev.patterns.behavioral.proxy.buday;

/**
 * Created by NIO on 15.04.2016. All rights reserved.
 */
public class ProxyDemo {
    public static void main(String[] args) throws BadOperationException {
        run();
    }

    private static void run() throws BadOperationException {
        int opNum = 0;
        try {
            RobotBombDefuserProxy proxy = new RobotBombDefuserProxy(41);
            proxy.walkStraigtForward(100);
            opNum++;
            proxy.turnRight();
            opNum++;
            proxy.walkStraigtForward(5);
            opNum++;
            proxy.defuseBomb();
            opNum++;
            System.out.println();
        }
        catch (BadOperationException e) {
            System.out.println("Exception has been caught with message " + e.getMessage() +
                    ". Decided to have human operate robot there.");
            planB(opNum);
        }
    }

    private static void planB(int nextOperationNumber) throws BadOperationException {
        RobotBombDefuser humanOperatingRobotDirectly = new RobotBombDefuser();

        if (nextOperationNumber == 0) {
            humanOperatingRobotDirectly.walkStraigtForward(100);
            nextOperationNumber++;
        }
        if (nextOperationNumber == 1) {
            humanOperatingRobotDirectly.turnRight();
            nextOperationNumber++;
        }
        if (nextOperationNumber == 2) {
            humanOperatingRobotDirectly.walkStraigtForward(5);
            nextOperationNumber++;
        }
        if (nextOperationNumber == 3) {
            humanOperatingRobotDirectly.defuseBomb();
        }
    }
}
