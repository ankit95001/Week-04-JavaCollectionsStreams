package com.example.day04exception.nestedtrycatchblock;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class NestedTryCatchExampleTest {

    @Test
    public void testValidOperation() {
        NestedTryCatchExample example = new NestedTryCatchExample();

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        example.performOperation(new int[]{10, 20, 30, 40, 50}, 2, 5);

        assertTrue(output.toString().trim().contains("Result: 6"));
    }

    @Test
    public void testInvalidIndex() {
        NestedTryCatchExample example = new NestedTryCatchExample();

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        example.performOperation(new int[]{10, 20, 30}, 10, 5);

        assertTrue(output.toString().trim().contains("Invalid array index!"));
    }

    @Test
    public void testDivisionByZero() {
        NestedTryCatchExample example = new NestedTryCatchExample();

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        example.performOperation(new int[]{10, 20, 30}, 2, 0);

        assertTrue(output.toString().trim().contains("Cannot divide by zero!"));
    }
}

