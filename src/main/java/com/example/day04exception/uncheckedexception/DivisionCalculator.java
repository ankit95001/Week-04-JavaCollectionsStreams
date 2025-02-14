package com.example.day04exception.uncheckedexception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionCalculator {
    public double divideNumbers(double numerator, double denominator) {
        if (denominator == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return numerator / denominator;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter numerator: ");
            double numerator = scanner.nextDouble();

            System.out.print("Enter denominator: ");
            double denominator = scanner.nextDouble();

            DivisionCalculator calculator = new DivisionCalculator();
            double result = calculator.divideNumbers(numerator, denominator);
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Error: Invalid input. Please enter numeric values.");
        } finally {
            scanner.close();
        }
    }
}

