package com.codewithmosh.state;

public class Bicycling extends TravelMode {
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
