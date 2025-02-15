package com.example.day05junit.basicjunittest;

public class LongRunningTask {
    public String longRunningTask() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return "Interrupted";
        }
        return "Task Completed";
    }

    public static void main(String[] args) {
        LongRunningTask task = new LongRunningTask();
        System.out.println(task.longRunningTask());
    }
}


