package com.fmdev.patterns.structural.bridge.buday;

/**
 * Created by NIO on 15.04.2016. All rights reserved.
 */
public class BuildingCompanyImpl implements BuildingCompany {
    private WallCreator wallCreator;

    public void buildFoundation() {
        System.out.println("Foundation has built.");
    }

    public void buildRoom() {
        wallCreator.buildWallWithDoor();
        wallCreator.buildWall();
        wallCreator.buildWallWithWindow();
        wallCreator.buildWall();

        System.out.println("Room has finished.");
    }

    public void buildRoof() {
        System.out.println("Roof is done!");
    }

    public void setWallCreator(WallCreator wallCreator) {
        this.wallCreator = wallCreator;
    }

    public WallCreator getWallCreator() {
        return wallCreator;
    }
}
