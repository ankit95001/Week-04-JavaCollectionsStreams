package com.example.reflection.methodexecutiontiming;

public class TaskProcessor {
    public void quickTask() {
        System.out.println("Quick task executed.");
    }

    public void longTask() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Long task executed.");
    }
}

