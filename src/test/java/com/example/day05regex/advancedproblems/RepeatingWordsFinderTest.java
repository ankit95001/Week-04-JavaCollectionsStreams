package com.example.day05regex.advancedproblems;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Set;
import java.util.HashSet;

public class RepeatingWordsFinderTest {

    @Test
    void testFindRepeatingWords() {
        String text = "This is is a repeated repeated word test.";
        Set<String> expected = new HashSet<>();
        expected.add("is");
        expected.add("repeated");
        assertEquals(expected, RepeatingWordsFinder.findRepeatingWords(text));
    }

    @Test
    void testNoRepeatingWords() {
        String text = "Each word is unique.";
        Set<String> expected = new HashSet<>();
        assertEquals(expected, RepeatingWordsFinder.findRepeatingWords(text));
    }

    @Test
    void testMultipleOccurrences() {
        String text = "hello hello world world world";
        Set<String> expected = new HashSet<>();
        expected.add("hello");
        expected.add("world");
        assertEquals(expected, RepeatingWordsFinder.findRepeatingWords(text));
    }

    @Test
    void testCaseInsensitiveCheck() {
        String text = "Hello hello HeLLo world WORLD";
        Set<String> expected = new HashSet<>();
        expected.add("hello");
        expected.add("world");
        assertEquals(expected, RepeatingWordsFinder.findRepeatingWords(text));
    }
}

