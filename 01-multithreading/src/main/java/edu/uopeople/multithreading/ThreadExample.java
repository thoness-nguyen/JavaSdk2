package edu.uopeople.multithreading;

public class ThreadExample {
    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            System.out.println("Hello from thread!");
        });

        t.start();
    }
}
