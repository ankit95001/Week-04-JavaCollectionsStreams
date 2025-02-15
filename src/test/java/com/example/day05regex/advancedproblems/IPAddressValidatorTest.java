package com.example.day05regex.advancedproblems;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class IPAddressValidatorTest {

    @Test
    void testValidIPAddresses() {
        assertTrue(IPAddressValidator.isValidIPAddress("192.168.1.1"));
        assertTrue(IPAddressValidator.isValidIPAddress("255.255.255.255"));
        assertTrue(IPAddressValidator.isValidIPAddress("0.0.0.0"));
    }

    @Test
    void testInvalidIPAddresses() {
        assertFalse(IPAddressValidator.isValidIPAddress("256.100.50.25"));
        assertFalse(IPAddressValidator.isValidIPAddress("192.168.1"));
        assertFalse(IPAddressValidator.isValidIPAddress("123.045.067.089"));
    }

    @Test
    void testEmptyAndNullInputs() {
        assertFalse(IPAddressValidator.isValidIPAddress(""));
        assertFalse(IPAddressValidator.isValidIPAddress(" "));
    }

    @Test
    void testNonNumericInputs() {
        assertFalse(IPAddressValidator.isValidIPAddress("abc.def.ghi.jkl"));
        assertFalse(IPAddressValidator.isValidIPAddress("192.168.1.one"));
    }
}

