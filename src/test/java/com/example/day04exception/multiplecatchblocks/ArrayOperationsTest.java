package com.example.day04exception.multiplecatchblocks;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ArrayOperationsTest {

    @Test
    public void testValidIndex() {
        ArrayOperations operations = new ArrayOperations();
        int[] array = {10, 20, 30, 40, 50};

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        operations.retrieveValue(array, 2);
        assertTrue(output.toString().trim().contains("Value at index 2: 30"));
    }

    @Test
    public void testInvalidIndex() {
        ArrayOperations operations = new ArrayOperations();
        int[] array = {10, 20, 30};

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        operations.retrieveValue(array, 5);
        assertTrue(output.toString().trim().contains("Invalid index!"));
    }

    @Test
    public void testNullArray() {
        ArrayOperations operations = new ArrayOperations();

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        operations.retrieveValue(null, 1);
        assertTrue(output.toString().trim().contains("Array is not initialized!"));
    }
}

