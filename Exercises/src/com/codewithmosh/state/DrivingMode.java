package com.codewithmosh.state;

public class DrivingMode extends TravelModeService {
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
