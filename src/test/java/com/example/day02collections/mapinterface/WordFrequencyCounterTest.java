package com.example.day02collections.mapinterface;

import org.junit.jupiter.api.Test;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;

class WordFrequencyCounterTest {

    @Test
    void testWordFrequencyCounter() {
        String text = "Hello world, hello Java!";
        Map<String, Integer> result = WordFrequencyCounter.wordFrequencyCounter(text);
        assertEquals(2, result.get("hello"));
        assertEquals(1, result.get("world"));
        assertEquals(1, result.get("java"));
    }

    @Test
    void testWordFrequencyWithPunctuation() {
        String text = "This is a test. This test is simple!";
        Map<String, Integer> result = WordFrequencyCounter.wordFrequencyCounter(text);
        assertEquals(2, result.get("this"));
        assertEquals(2, result.get("is"));
        assertEquals(2, result.get("test"));
        assertEquals(1, result.get("a"));
        assertEquals(1, result.get("simple"));
    }

    @Test
    void testWordFrequencyWithCaseSensitivity() {
        String text = "Case CASE case CaSe";
        Map<String, Integer> result = WordFrequencyCounter.wordFrequencyCounter(text);
        assertEquals(4, result.get("case"));
    }

    @Test
    void testWordFrequencyWithEmptyString() {
        String text = "";
        Map<String, Integer> result = WordFrequencyCounter.wordFrequencyCounter(text);
        assertTrue(result.isEmpty());
    }

    @Test
    void testWordFrequencyWithOnlyPunctuation() {
        String text = "!!!,,...???";
        Map<String, Integer> result = WordFrequencyCounter.wordFrequencyCounter(text);
        assertTrue(result.isEmpty());
    }
}
