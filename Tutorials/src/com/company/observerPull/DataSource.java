package com.company.observerPull;

import java.util.ArrayList;

public class DataSource extends Subject {
    private int value;
    private ArrayList<Observer> observers;


    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
        notifyObservers();
    }
}
