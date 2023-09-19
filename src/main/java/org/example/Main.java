package org.example;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello world!");

        Thread.sleep(6000);

        new Thread(() -> {
            System.out.println("3 + 3 == 9");
        }).run();
    }
}
