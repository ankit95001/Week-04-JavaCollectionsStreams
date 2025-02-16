package com.example.reflection.methodexecutiontiming;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        measureExecutionTime(TaskProcessor.class, "quickTask");
        measureExecutionTime(TaskProcessor.class, "longTask");
    }

    public static void measureExecutionTime(Class<?> clazz, String methodName) {
        try {
            Object instance = clazz.getDeclaredConstructor().newInstance();
            Method method = clazz.getDeclaredMethod(methodName);

            long startTime = System.nanoTime();
            method.invoke(instance);
            long endTime = System.nanoTime();

            long duration = (endTime - startTime) / 1_000_000; // Convert to milliseconds
            System.out.println("Execution time of " + methodName + ": " + duration + " ms");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

