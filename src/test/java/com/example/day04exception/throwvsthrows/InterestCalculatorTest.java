package com.example.day04exception.throwvsthrows;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class InterestCalculatorTest {

    @Test
    public void testValidInterestCalculation() {
        InterestCalculator calculator = new InterestCalculator();
        double interest = calculator.calculateInterest(1000, 5, 3);
        assertEquals(150.0, interest, 0.01);
    }

    @Test
    public void testNegativeAmount() {
        InterestCalculator calculator = new InterestCalculator();
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> calculator.calculateInterest(-1000, 5, 3));
        assertEquals("Amount and rate must be positive", exception.getMessage());
    }

    @Test
    public void testNegativeRate() {
        InterestCalculator calculator = new InterestCalculator();
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> calculator.calculateInterest(1000, -5, 3));
        assertEquals("Amount and rate must be positive", exception.getMessage());
    }
}
