package com.example.day04exception.nestedtrycatchblock;

public class NestedTryCatchExample {
    public void performOperation(int[] arr, int index, int divisor) {
        try {
            int value;
            try {
                value = arr[index];
                int result = value / divisor;
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero!");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index!");
        }
    }

    public static void main(String[] args) {
        NestedTryCatchExample example = new NestedTryCatchExample();

        int[] array = {10, 20, 30, 40, 50};
        int validIndex = 2, validDivisor = 5;
        int invalidIndex = 10;
        int zeroDivisor = 0;

        // Valid case
        example.performOperation(array, validIndex, validDivisor);

        // Index out of bounds case
        example.performOperation(array, invalidIndex, validDivisor);

        // Division by zero case
        example.performOperation(array, validIndex, zeroDivisor);
    }
}

