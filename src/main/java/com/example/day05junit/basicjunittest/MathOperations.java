package com.example.day05junit.basicjunittest;

public class MathOperations {

    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }

    public static void main(String[] args) {
        MathOperations math = new MathOperations();

        System.out.println("10 / 2 = " + math.divide(10, 2));

    }
}

