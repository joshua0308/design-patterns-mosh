package com.codewithmosh.mediator;

import java.util.ArrayList;
import java.util.List;

public class UIControl {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    protected void notifyObservers() {
        for (var observer : observers)
            observer.update();
    }
}
