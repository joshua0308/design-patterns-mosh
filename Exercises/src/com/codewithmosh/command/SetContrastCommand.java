package com.codewithmosh.command;

public class SetContrastCommand extends AbstractUndoableCommand {
    private Float prevContent;
    private Float contrast;

    public SetContrastCommand(Float contrast, VideoEditor editor, History history) {
        super(editor, history);
        this.contrast = contrast;
    }

    @Override
    protected void doExecute() {
        prevContent = editor.getContrast();
        editor.setContrast(contrast);
    }

    @Override
    public void undo() {
        editor.setContrast(prevContent);
    }
}
