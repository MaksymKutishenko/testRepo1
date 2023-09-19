package org.example;

import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello world!");

        Thread.sleep(6000);

        new Thread(() -> {
            System.out.println("4 + 4 == 16");
        }).run();

        Logger anonymousLogger = Logger.getAnonymousLogger();
    }
}
