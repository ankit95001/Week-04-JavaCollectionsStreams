package com.example.day04exception.finallyblockexecution;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class DivisionExampleTest {

    @Test
    public void testValidDivision() {
        DivisionExample division = new DivisionExample();
        int result = division.divide(10, 2);
        assertEquals(5, result);
    }

    @Test
    public void testDivisionByZero() {
        DivisionExample division = new DivisionExample();

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        division.divide(10, 0);

        String outputText = output.toString().trim();
        assertTrue(outputText.contains("Cannot divide by zero"));
        assertTrue(outputText.contains("Operation completed"));
    }

    @Test
    public void testFinallyExecution() {
        DivisionExample division = new DivisionExample();

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        division.divide(10, 2); // Valid case

        assertTrue(output.toString().trim().contains("Operation completed"));
    }
}

