package com.codewithmosh.state;

public class Demo {
    static public void show() {
        DirectionService directionService = new DirectionService();
//        directionService.setTravelModeService(new DrivingMode());
//        directionService.setTravelModeService(new BicyclingMode());
//        directionService.setTravelModeService(new TransitMode());
        directionService.setTravelModeService(new WalkingMode());
        directionService.getEta();
        directionService.getDirection();
    }
}
