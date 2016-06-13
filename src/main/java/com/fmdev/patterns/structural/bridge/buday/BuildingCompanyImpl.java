package com.fmdev.patterns.structural.bridge.buday;

class BuildingCompanyImpl implements BuildingCompany {
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
