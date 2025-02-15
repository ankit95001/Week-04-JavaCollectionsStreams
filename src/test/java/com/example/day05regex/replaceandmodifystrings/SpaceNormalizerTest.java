package com.example.day05regex.replaceandmodifystrings;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SpaceNormalizerTest {

    @Test
    void testNormalizeSpaces() {
        String text = "This   is   an  example    with   multiple   spaces.";
        String expected = "This is an example with multiple spaces.";
        assertEquals(expected, SpaceNormalizer.normalizeSpaces(text));
    }

    @Test
    void testLeadingAndTrailingSpaces() {
        String text = "   Leading and trailing spaces   ";
        String expected = " Leading and trailing spaces ";
        assertEquals(expected, SpaceNormalizer.normalizeSpaces(text));
    }

    @Test
    void testNoExtraSpaces() {
        String text = "No extra spaces here.";
        assertEquals(text, SpaceNormalizer.normalizeSpaces(text));
    }

    @Test
    void testOnlySpaces() {
        String text = "      ";
        String expected = " ";
        assertEquals(expected, SpaceNormalizer.normalizeSpaces(text));
    }
}

