package com.example.reflection.dynamicmethodinvocation;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        invokeMethod("add", 10, 5);
        invokeMethod("subtract", 10, 5);
        invokeMethod("multiply", 10, 5);
    }

    public static void invokeMethod(String methodName, int a, int b) {
        try {
            Class<?> cls = Class.forName("com.example.reflection.dynamicmethodinvocation.MathOperations");
            Object instance = cls.getDeclaredConstructor().newInstance();

            Method method = cls.getMethod(methodName, int.class, int.class);
            
            int result = (int) method.invoke(instance, a, b);
            System.out.println(methodName + "(" + a + ", " + b + ") = " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
