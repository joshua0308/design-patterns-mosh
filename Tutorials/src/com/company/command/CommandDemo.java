package com.company.command;

import com.company.command.editor.BoldCommand;
import com.company.command.editor.History;
import com.company.command.editor.HtmlDocument;
import com.company.command.editor.UndoCommand;
import com.company.command.fx.Button;

public class CommandDemo {
    public static void show() {
        var history = new History();
        var document = new HtmlDocument();
        document.setContent("Hello world");

        var boldCommand = new BoldCommand(document, history);
        boldCommand.execute();
        System.out.println(document.getContent());

        var undoCommand = new UndoCommand(history);
        undoCommand.execute();
        System.out.println(document.getContent());
    }

    public static void showBasic() {
        var service = new CustomerService();
        var command = new AddCustomerCommand(service);
        var button = new Button(command);
        button.click();
    }

    public static void showComposite() {
        var composite = new CompositeCommand();
        composite.add(new ResizeCommand());
        composite.add(new BlackAndWhiteCommand());
        composite.execute();
        composite.execute();
    }
}
