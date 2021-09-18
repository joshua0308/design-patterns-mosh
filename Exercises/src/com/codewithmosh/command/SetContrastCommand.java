package com.codewithmosh.command;

public class SetContrastCommand implements FloatCommand, UndoableCommand {
    private VideoEditor editor;
    private History history;
    private Float prevContent;

    public SetContrastCommand(VideoEditor editor, History history) {
        this.editor = editor;
        this.history = history;
    }

    @Override
    public void execute(Float contrast) {
        prevContent = editor.getContrast();
        editor.setContrast(contrast);
        history.push(this);
    }

    @Override
    public void unexecute() {
        editor.setContrast(prevContent);
    }
}
