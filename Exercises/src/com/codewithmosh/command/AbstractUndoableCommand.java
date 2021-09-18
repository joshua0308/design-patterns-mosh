package com.codewithmosh.command;

public abstract class AbstractUndoableCommand implements UndoableCommand {
    protected VideoEditor editor;
    private History history;

    public AbstractUndoableCommand(VideoEditor editor, History history) {
        this.editor = editor;
        this.history = history;
    }

    @Override
    public void execute() {
        // Using template method pattern to define a template for executing a command.
        // Subclass specific logic is implemented in doExecute().
        // Common logic is implemented in execute().
        doExecute();
        history.push(this);
    }

    protected abstract void doExecute();
}
