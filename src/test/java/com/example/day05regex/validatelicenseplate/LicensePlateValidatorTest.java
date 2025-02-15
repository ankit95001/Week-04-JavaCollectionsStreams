package com.example.day05regex.validatelicenseplate;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class LicensePlateValidatorTest {

    @Test
    void testValidLicensePlates() {
        assertTrue(LicensePlateValidator.isValidLicensePlate("AB1234"));
        assertTrue(LicensePlateValidator.isValidLicensePlate("XY9876"));
        assertTrue(LicensePlateValidator.isValidLicensePlate("ZZ0000"));
    }

    @Test
    void testInvalidLicensePlates() {
        assertFalse(LicensePlateValidator.isValidLicensePlate("A12345")); // Only one letter at the start
        assertFalse(LicensePlateValidator.isValidLicensePlate("abc1234")); // Lowercase letters
        assertFalse(LicensePlateValidator.isValidLicensePlate("AB12")); // Too short
        assertFalse(LicensePlateValidator.isValidLicensePlate("A1234")); // Only one letter
        assertFalse(LicensePlateValidator.isValidLicensePlate("AB12345")); // Extra digit
    }
}
