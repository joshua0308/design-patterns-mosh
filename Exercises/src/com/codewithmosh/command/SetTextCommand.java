package com.codewithmosh.command;

public class SetTextCommand implements TextCommand, UndoableCommand {
    private VideoEditor editor;
    private History history;
    private String prevContent;

    public SetTextCommand(VideoEditor editor, History history) {
        this.editor = editor;
        this.history = history;
    }

    @Override
    public void execute(String text) {
        prevContent = editor.getText();
        editor.setText(text);
        history.push(this);
    }


    @Override
    public void unexecute() {
        editor.setText(prevContent);
    }
}
