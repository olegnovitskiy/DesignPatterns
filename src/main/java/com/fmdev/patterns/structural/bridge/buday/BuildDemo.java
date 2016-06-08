package com.fmdev.patterns.structural.bridge.buday;

/**
 * Created by NIO on 15.04.2016. All rights reserved.
 */
public class BuildDemo {
    public static void main(String[] args) {
        BrickWallCreator brickWallCreator = new BrickWallCreator();
        ConcreteWallCreator concreteWallCreator = new ConcreteWallCreator();
        BuildingCompany buildingCompany = new BuildingCompanyImpl();

        buildingCompany.buildFoundation();
        buildingCompany.setWallCreator(concreteWallCreator);
        buildingCompany.buildRoom();

        buildingCompany.setWallCreator(brickWallCreator);
        buildingCompany.buildRoom();
        buildingCompany.buildRoom();

        buildingCompany.buildRoof();
    }
}
