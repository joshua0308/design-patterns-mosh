package com.codewithmosh.command;

import java.util.ArrayDeque;
import java.util.Deque;

public class History {
    private Deque<UndoableCommand> commands = new ArrayDeque<>();

    public void push(UndoableCommand command) {
        commands.add(command);
    }

    public UndoableCommand pop() {
        System.out.println("debug: commands" + commands);


        var command = commands.removeLast();

        System.out.println("debug: command" + command);
        System.out.println("debug: commands" + commands);
        return command;
    }

    public int size() {
        return commands.size();
    }
}
