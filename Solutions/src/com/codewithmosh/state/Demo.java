package com.codewithmosh.state;

public class Demo {
    public static void show() {
        var service = new DirectionService(new Driving());
        service.getEta();
        service.getDirection();
    }
}
