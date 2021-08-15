package com.codewithmosh.state;

public class BicyclingMode extends TravelModeService {
    @Override
    Object getEta() {
        System.out.println("Calculating ETA (bicycling)");
        return 2;
    }

    @Override
    Object getDirection() {
        System.out.println("Calculating Direction (bicycling)");
        return 2;
    }
}
