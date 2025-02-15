package com.example.day05regex.basicregexproblems;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class HexColorValidatorTest {

    @Test
    void testValidHexColors() {
        assertTrue(HexColorValidator.isValidHexColor("#FFA500"));
        assertTrue(HexColorValidator.isValidHexColor("#ff4500"));
        assertTrue(HexColorValidator.isValidHexColor("#FFFFFF"));
        assertTrue(HexColorValidator.isValidHexColor("#000000"));
        assertTrue(HexColorValidator.isValidHexColor("#12AB34"));
    }

    @Test
    void testInvalidHexColors() {
        assertFalse(HexColorValidator.isValidHexColor("#123")); // Too short
        assertFalse(HexColorValidator.isValidHexColor("#GHIJKL")); // Contains invalid characters
        assertFalse(HexColorValidator.isValidHexColor("123456")); // Missing #
        assertFalse(HexColorValidator.isValidHexColor("#1A2B3")); // Only 5 characters after #
        assertFalse(HexColorValidator.isValidHexColor("#1234567")); // Too long
    }
}

