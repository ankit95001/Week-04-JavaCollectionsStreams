package com.example.day04exception.multiplecatchblocks;

public class ArrayOperations {
    public void retrieveValue(int[] array, int index) {
        try {
            System.out.println("Value at index " + index + ": " + array[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index!");
        } catch (NullPointerException e) {
            System.out.println("Array is not initialized!");
        }
    }

    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        int validIndex = 2;
        int invalidIndex = 10;
        int[] nullArray = null;

        ArrayOperations operations = new ArrayOperations();

        // Valid case
        operations.retrieveValue(array, validIndex);

        // Invalid index case
        operations.retrieveValue(array, invalidIndex);

        // Null array case
        operations.retrieveValue(nullArray, 1);
    }
}
