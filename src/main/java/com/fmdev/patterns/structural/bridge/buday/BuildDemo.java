package com.fmdev.patterns.structural.bridge.buday;

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
