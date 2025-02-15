package com.example.day05junit.advancedjunitpracticeproblems;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {

    @Test
    void testValidPassword() {
        assertTrue(PasswordValidator.isValidPassword("Password1"), "Valid password should return true");
    }

    @Test
    void testPasswordWithoutUppercase() {
        assertFalse(PasswordValidator.isValidPassword("password1"), "Password without uppercase should return false");
    }

    @Test
    void testPasswordWithoutDigit() {
        assertFalse(PasswordValidator.isValidPassword("Password"), "Password without a digit should return false");
    }

    @Test
    void testShortPassword() {
        assertFalse(PasswordValidator.isValidPassword("P1ss"), "Password with less than 8 characters should return false");
    }

    @Test
    void testNullPassword() {
        assertFalse(PasswordValidator.isValidPassword(null), "Null password should return false");
    }
}

