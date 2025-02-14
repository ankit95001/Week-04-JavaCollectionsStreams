package com.example.day04exception.finallyblockexecution;

public class DivisionExample {
    public int divide(int numerator, int denominator) {
        int result = 0;
        try {
            result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        } finally {
            System.out.println("Operation completed");
        }
        return result;
    }

    public static void main(String[] args) {
        DivisionExample division = new DivisionExample();

        int validNumerator = 10, validDenominator = 2;
        int invalidDenominator = 0;

        division.divide(validNumerator, validDenominator);


        division.divide(validNumerator, invalidDenominator);
    }
}

