package com.company.command.editor;

public class BoldCommand implements UndoableCommand {
    private String prevContent;
    private HtmlDocument document;
    private History history;

    public BoldCommand(HtmlDocument document, History history) {
        this.document = document;
        this.history = history;
    }

    @Override
    public void execute() {
        prevContent = document.getContent();
        document.makeBold();
        history.push(this);
    }

    // Invoke through UndoCommand using History
    @Override
    public void unexecute() {
        document.setContent(prevContent);
    }
}
