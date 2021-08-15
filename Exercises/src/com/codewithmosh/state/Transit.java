package com.codewithmosh.state;

public class Transit extends TravelMode {
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
