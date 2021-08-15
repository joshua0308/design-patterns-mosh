package com.codewithmosh.state;

public class Demo {
    static public void show() {
//        DirectionService directionService = new DirectionService(new Driving());
//        DirectionService directionService = new DirectionService(new Bicycling());
//        DirectionService directionService = new DirectionService(new Transit());
        DirectionService directionService = new DirectionService(new Walking());
        directionService.getEta();
        directionService.getDirection();
    }
}
