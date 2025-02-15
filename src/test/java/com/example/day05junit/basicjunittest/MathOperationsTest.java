package com.example.day05junit.basicjunittest;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MathOperationsTest {
    MathOperations math = new MathOperations();

    @Test
    void testDivideValid() {
        assertEquals(5, math.divide(10, 2));
        assertEquals(0, math.divide(0, 5));
        assertEquals(-3, math.divide(-9, 3));
    }

    @Test
    void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> math.divide(5, 0));
    }
}
