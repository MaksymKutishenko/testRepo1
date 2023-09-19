package org.example;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Long counter = 0L;
        System.out.println("Hello world!");

        Thread.sleep(6000);

        new Thread(() -> {
            System.out.println("6 + 6 == 36");
        }).run();
    }
}
