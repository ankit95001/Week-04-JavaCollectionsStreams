package com.example.day05regex.advancedproblems;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SSNValidatorTest {

    @Test
    void testValidSSN() {
        assertTrue(SSNValidator.isValidSSN("123-45-6789"));
    }

    @Test
    void testInvalidSSN_NoDashes() {
        assertFalse(SSNValidator.isValidSSN("123456789"));
    }

    @Test
    void testInvalidSSN_WrongFormat() {
        assertFalse(SSNValidator.isValidSSN("12-345-6789"));
        assertFalse(SSNValidator.isValidSSN("123-456-789"));
    }

    @Test
    void testInvalidSSN_NonNumeric() {
        assertFalse(SSNValidator.isValidSSN("ABC-DE-FGHI"));
    }
}

