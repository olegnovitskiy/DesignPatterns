package com.fmdev.patterns.structural.bridge.buday;

interface BuildingCompany {
    void buildFoundation();
    void buildRoom();
    void buildRoof();
    void setWallCreator(WallCreator wallCreator);
    WallCreator getWallCreator();
}
