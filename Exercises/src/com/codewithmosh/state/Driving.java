package com.codewithmosh.state;

public class Driving extends TravelMode {
    @Override
    Object getEta() {
        System.out.println("Calculating ETA (driving)");
        return 1;
    }

    @Override
    Object getDirection() {
        System.out.println("Calculating Direction (driving)");
        return 1;
    }
}
