package com.codewithmosh.state;

public class Walking extends TravelMode {
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
