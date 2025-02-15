package com.example.day05junit.basicjunittest;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class StringUtilsTest {
    StringUtils utils = new StringUtils();

    @Test
    void testReverse() {
        assertEquals("olleh", utils.reverse("hello"));
        assertEquals("12321", utils.reverse("12321"));
        assertEquals("", utils.reverse(""));
    }

    @Test
    void testIsPalindrome() {
        assertTrue(utils.isPalindrome("madam"));
        assertTrue(utils.isPalindrome("racecar"));
        assertTrue(utils.isPalindrome("Mom"));
        assertFalse(utils.isPalindrome("hello"));
    }

    @Test
    void testToUpperCase() {
        assertEquals("HELLO", utils.toUpperCase("hello"));
        assertEquals("WORLD", utils.toUpperCase("world"));
        assertEquals("123", utils.toUpperCase("123"));
    }
}

