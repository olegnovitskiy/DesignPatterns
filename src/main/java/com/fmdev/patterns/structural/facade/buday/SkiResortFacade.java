package com.fmdev.patterns.structural.facade.buday;

/**
 * Created by NIO on 14.04.2016. All rights reserved.
 */
public class SkiResortFacade {
    private SkiRent skiRent = new SkiRent();
    private SkiResortTicketSystem skiResortTicketSystem = new SkiResortTicketSystem();
    private HotelBookingSystem hotelBookingSystem = new HotelBookingSystem();

    public int HavingGoodRest(int height, int weight, int feetSize, int skierLevel, int roomQuality) {
        int skiPrice = skiRent.rentSki(weight, skierLevel);
        int skiBootsPrice = skiRent.rentBoot(feetSize, skierLevel);
        int polePrice = skiRent.rentPole(height);
        int oneDayTicketPrice = skiResortTicketSystem.buyOneDayTicket();
        int hotelPrice = hotelBookingSystem.bookRoom(roomQuality);

        return skiPrice + skiBootsPrice + polePrice + oneDayTicketPrice + hotelPrice;
    }

    public int HavingRestWithOwnSkis() {
        int oneDayTicketPrice = skiResortTicketSystem.buyOneDayTicket();
        return oneDayTicketPrice;
    }
}
