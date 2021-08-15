package com.codewithmosh.state;

public class WalkingMode extends TravelModeService {
    @Override
    Object getEta() {
        System.out.println("Calculating ETA (walking)");
        return 3;
    }

    @Override
    Object getDirection() {
        System.out.println("Calculating Direction (walking)");
        return 3;
    }
}
