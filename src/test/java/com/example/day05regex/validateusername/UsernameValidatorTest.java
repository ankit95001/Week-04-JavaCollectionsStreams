package com.example.day05regex.validateusername;

import static org.junit.jupiter.api.Assertions.*;

import com.example.day05regex.validateusername.UsernameValidator;
import org.junit.jupiter.api.Test;

public class UsernameValidatorTest {

    @Test
    void testValidUsernames() {
        assertTrue(UsernameValidator.isValidUsername("user_123"));
        assertTrue(UsernameValidator.isValidUsername("John_Doe99"));
        assertTrue(UsernameValidator.isValidUsername("validUser1"));
    }

    @Test
    void testInvalidUsernames() {
        assertFalse(UsernameValidator.isValidUsername("123user")); // Starts with a number
        assertFalse(UsernameValidator.isValidUsername("us")); // Too short
        assertFalse(UsernameValidator.isValidUsername("_username")); // Starts with '_'
        assertFalse(UsernameValidator.isValidUsername("user@name")); // Contains '@'
        assertFalse(UsernameValidator.isValidUsername("verylongusername_exceeding")); // Too long
    }
}

