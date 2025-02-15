package com.example.day05regex.advancedproblems;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CreditCardValidatorTest {

    @Test
    void testValidVisaCards() {
        assertTrue(CreditCardValidator.isValidCreditCard("4123456789012345"));
        assertTrue(CreditCardValidator.isValidCreditCard("4999999999999999"));
    }

    @Test
    void testValidMasterCards() {
        assertTrue(CreditCardValidator.isValidCreditCard("5123456789012345"));
        assertTrue(CreditCardValidator.isValidCreditCard("5999999999999999"));
    }

    @Test
    void testInvalidCreditCards() {
        assertFalse(CreditCardValidator.isValidCreditCard("6123456789012345")); // Does not start with 4 or 5
        assertFalse(CreditCardValidator.isValidCreditCard("4234567890123")); // Too short
        assertFalse(CreditCardValidator.isValidCreditCard("52345678901234567")); // Too long
    }

    @Test
    void testEmptyAndNullInputs() {
        assertFalse(CreditCardValidator.isValidCreditCard(""));
        assertFalse(CreditCardValidator.isValidCreditCard(" "));
    }

    @Test
    void testNonNumericInputs() {
        assertFalse(CreditCardValidator.isValidCreditCard("4A23456789012345"));
        assertFalse(CreditCardValidator.isValidCreditCard("5X23456789012345"));
    }
}

