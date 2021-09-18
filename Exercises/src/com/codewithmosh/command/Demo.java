package com.codewithmosh.command;

public class Demo {
    public static void show() {
        var editor = new VideoEditor();
        var history = new History();

        System.out.println(editor.toString());

        var setTextCommand = new SetTextCommand("hello", editor, history);
        var setContrastCommand = new SetContrastCommand(3.5f, editor, history);
        var undoCommand = new UndoCommand(history);

        setTextCommand.execute();
        System.out.println("setTextCommand " + editor.toString());

        setContrastCommand.execute();
        System.out.println("setContrastCommand " + editor.toString());

        undoCommand.execute();
        System.out.println("undoCommand " + editor.toString());

        undoCommand.execute();
        System.out.println("undoCommand " + editor.toString());
    }
}
