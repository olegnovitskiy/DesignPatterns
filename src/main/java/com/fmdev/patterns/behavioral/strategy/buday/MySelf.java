package com.fmdev.patterns.behavioral.strategy.buday;

/**
 * Created by NIO on 14.04.2016. All rights reserved.
 */

public class MySelf {
    public void goOutside() {
        Weather weather = WeatherCenter.getWeather();
        String clothes = getClothes(weather);
        String accessories = getAccessories(weather);
        System.out.println("Today I wore " + clothes + " and took " + accessories);
    }

    private String getAccessories(Weather weather) {
        String accessories;

        switch (weather) {
            case SUNNY:
                accessories = "sunglasses";
                break;
            case RAINY:
                accessories = "umbrella";
                break;
            default:
                accessories = "nothing";
        }

        return accessories;
    }

    private String getClothes(Weather weather) {
        String clothes;

        switch (weather) {
            case SUNNY:
                clothes = "T-Shirt";
                break;
            case RAINY:
                clothes = "Coat";
                break;
            default:
                clothes = "Shirt";
        }

        return clothes;
    }

}
