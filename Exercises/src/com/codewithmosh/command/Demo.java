package com.codewithmosh.command;

public class Demo {
    public static void show() {
        var editor = new VideoEditor();
        var history = new History();

        editor.setText("foo");
        editor.setContrast(0.5f);

        var setTextCommand = new SetTextCommand(editor, history);
        var setContrastCommand = new SetContrastCommand(editor, history);
        var undoCommand = new UndoCommand(history);

        setTextCommand.execute("hello");
        setContrastCommand.execute(3.5f);
        System.out.println(editor.toString());

        undoCommand.execute();
        System.out.println(editor.toString());

        undoCommand.execute();
        System.out.println(editor.toString());
    }
}
