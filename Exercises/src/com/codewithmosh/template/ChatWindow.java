package com.codewithmosh.template;

public class ChatWindow extends Window {
    protected void onClosing() {
        System.out.println("Window A - before close");
    }

    protected void onClosed() {
        System.out.println("Window A - after close");
    }
}
