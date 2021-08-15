package com.codewithmosh.state;

public class TransitMode extends TravelModeService {
    @Override
    Object getEta() {
        System.out.println("Calculating ETA (transit)");
        return 3;
    }

    @Override
    Object getDirection() {
        System.out.println("Calculating Direction (transit)");
        return 3;
    }
}
