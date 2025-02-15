package com.example.day05junit.advancedjunitpracticeproblems;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UserRegistrationTest {

    @Test
    void testValidUserRegistration() {
        assertEquals("User registered successfully",
                UserRegistration.registerUser("Aakrati", "aakrati@example.com", "Secure123"));
    }

    @Test
    void testInvalidEmail() {
        assertThrows(IllegalArgumentException.class,
                () -> UserRegistration.registerUser("Aakrati", "invalid-email", "Secure123"));
    }

    @Test
    void testInvalidPassword() {
        assertThrows(IllegalArgumentException.class,
                () -> UserRegistration.registerUser("Aakrati", "aakrati@example.com", "weakpass"));
    }

    @Test
    void testEmptyUsername() {
        assertThrows(IllegalArgumentException.class,
                () -> UserRegistration.registerUser("", "aakrati@example.com", "Secure123"));
    }

    @Test
    void testNullUsername() {
        assertThrows(IllegalArgumentException.class,
                () -> UserRegistration.registerUser(null, "akriti@example.com", "Secure123"));
    }
}

