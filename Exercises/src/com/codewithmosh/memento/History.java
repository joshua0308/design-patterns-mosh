package com.codewithmosh.memento;

import java.util.ArrayList;
import java.util.List;

public class History {
    private List<DocumentMemento> states = new ArrayList<>();

    public void push(DocumentMemento state) {
        states.add(state);
    }

    public DocumentMemento pop() {
        var lastIndex = states.size() - 1;
        var lastState = states.get(lastIndex);
        states.remove(lastState);

        return lastState;
    }
}
