package com.example.day04exception.throwvsthrows;

public class InterestCalculator {
    public double calculateInterest(double amount, double rate, int years) throws IllegalArgumentException {
        if (amount < 0 || rate < 0) {
            throw new IllegalArgumentException("Amount and rate must be positive");
        }
        return amount * rate * years / 100;
    }

    public static void main(String[] args) {
        InterestCalculator calculator = new InterestCalculator();

        double validAmount = 1000, validRate = 5;
        int years = 3;

        double invalidAmount = -500;
        double invalidRate = -2;

        try {
            double interest = calculator.calculateInterest(validAmount, validRate, years);
            System.out.println("Calculated Interest: " + interest);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid input: " + e.getMessage());
        }

        try {
            double interest = calculator.calculateInterest(invalidAmount, validRate, years);
            System.out.println("Calculated Interest: " + interest);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid input: " + e.getMessage());
        }

        try {
            double interest = calculator.calculateInterest(validAmount, invalidRate, years);
            System.out.println("Calculated Interest: " + interest);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid input: " + e.getMessage());
        }
    }
}

