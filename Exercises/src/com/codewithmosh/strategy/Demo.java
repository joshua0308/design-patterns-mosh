package com.codewithmosh.strategy;

public class Demo {
    public static void show() {
        var desChatClient = new ChatClient(new DES());
        desChatClient.send("hello");

        var aesChatClient = new ChatClient(new AES());
        aesChatClient.send("world");
    }
}
