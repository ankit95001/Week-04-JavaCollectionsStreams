package com.example.day04exception.customexception;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AgeValidatorTest {

    @Test
    public void testValidAge() {
        AgeValidator validator = new AgeValidator();
        assertDoesNotThrow(() -> validator.validateAge(18));
    }

    @Test
    public void testInvalidAge() {
        AgeValidator validator = new AgeValidator();
        Exception exception = assertThrows(InvalidAgeException.class, () -> validator.validateAge(16));
        assertEquals("Age must be 18 or above", exception.getMessage());
    }
}

