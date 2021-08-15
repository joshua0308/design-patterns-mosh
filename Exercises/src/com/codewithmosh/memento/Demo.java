package com.codewithmosh.memento;

public class Demo {
    public static void show() {
        var document = new Document();
        var history = new History();

        document.setContent("a");
        document.setFontName("arial");
        document.setFontSize(1);
        history.push(document.createState());

        document.setContent("b");
        document.setFontName("times");
        document.setFontSize(2);
        history.push(document.createState());

        document.setContent("c");
        document.setFontName("black");
        document.setFontSize(3);

        document.restore(history.pop());
        document.restore(history.pop());

        System.out.println(document.toString());
    }
}
