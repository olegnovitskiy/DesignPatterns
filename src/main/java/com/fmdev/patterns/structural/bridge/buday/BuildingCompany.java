package com.fmdev.patterns.structural.bridge.buday;

/**
 * Created by NIO on 15.04.2016. All rights reserved.
 */
public interface BuildingCompany {
    void buildFoundation();
    void buildRoom();
    void buildRoof();
    void setWallCreator(WallCreator wallCreator);
    WallCreator getWallCreator();
}
