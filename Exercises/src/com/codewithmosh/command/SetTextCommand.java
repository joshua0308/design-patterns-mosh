package com.codewithmosh.command;

public class SetTextCommand extends AbstractUndoableCommand {
    private String text;

    public SetTextCommand(String text, VideoEditor editor, History history) {
        super(editor, history);
        this.text = text;
    }

    @Override
    protected void doExecute() {
        editor.setText(text);
    }

    @Override
    public void undo() {
        editor.removeText();
    }
}
