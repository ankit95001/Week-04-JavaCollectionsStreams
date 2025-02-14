package com.example.day04exception.exceptionpropagation;

public class ExceptionPropagationExample {
    public void method1() {
        int result = 10 / 0;
        System.out.println("Result: " + result);
    }

    public void method2() {
        method1();
    }

    public static void main(String[] args) {
        ExceptionPropagationExample example = new ExceptionPropagationExample();
        try {
            example.method2();
        } catch (ArithmeticException e) {
            System.out.println("Handled exception in main");
        }
    }
}

