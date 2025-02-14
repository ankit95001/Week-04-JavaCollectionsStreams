package com.example.day04exception.uncheckedexception;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class DivisionCalculatorTest {

    @Test
    public void testValidDivision() {
        DivisionCalculator calculator = new DivisionCalculator();
        assertEquals(2.5, calculator.divideNumbers(5, 2));
    }

    @Test
    public void testDivisionByZero() {
        DivisionCalculator calculator = new DivisionCalculator();
        Exception exception = assertThrows(ArithmeticException.class, () -> calculator.divideNumbers(10, 0));
        assertEquals("Cannot divide by zero", exception.getMessage());
    }
}

