package com.example.day04exception.exceptionpropagation;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ExceptionPropagationExampleTest {

    @Test
    public void testExceptionPropagation() {
        ExceptionPropagationExample example = new ExceptionPropagationExample();

        Exception exception = assertThrows(ArithmeticException.class, () -> {
            example.method1();
        });

        assertEquals("/ by zero", exception.getMessage());
    }

    @Test
    public void testHandlingInMain() {
        ExceptionPropagationExample example = new ExceptionPropagationExample();

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        try {
            example.main(new String[]{}); // Call main method
        } catch (Exception ignored) {}

        assertTrue(output.toString().trim().contains("Handled exception in main"));
    }
}

