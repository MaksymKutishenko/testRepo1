package org.example;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello world!");

        Thread.sleep(6000);
        System.exit(1);

        new Thread(() -> {
            System.out.println("2 + 2 == 4");
        }).run();
    }
}
