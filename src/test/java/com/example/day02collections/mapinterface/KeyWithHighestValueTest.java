package com.example.day02collections.mapinterface;

import org.junit.jupiter.api.Test;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;

class KeyWithHighestValueTest {

    @Test
    void testFindKeyWithHighestValue() {
        Map<String, Integer> input = Map.of("A", 10, "B", 20, "C", 15);
        assertEquals("B", KeyWithHighestValue.findKeyWithHighestValue(input));
    }

    @Test
    void testFindKeyWithHighestValueSingleEntry() {
        Map<String, Integer> input = Map.of("X", 100);
        assertEquals("X", KeyWithHighestValue.findKeyWithHighestValue(input));
    }

    @Test
    void testFindKeyWithHighestValueMultipleMax() {
        Map<String, Integer> input = Map.of("A", 30, "B", 30, "C", 20);
        String result = KeyWithHighestValue.findKeyWithHighestValue(input);
        assertTrue(result.equals("A") || result.equals("B"));
    }

    @Test
    void testFindKeyWithHighestValueNegativeValues() {
        Map<String, Integer> input = Map.of("A", -10, "B", -5, "C", -15);
        assertEquals("B", KeyWithHighestValue.findKeyWithHighestValue(input));
    }

    @Test
    void testFindKeyWithHighestValueAllSameValues() {
        Map<String, Integer> input = Map.of("A", 50, "B", 50, "C", 50);
        String result = KeyWithHighestValue.findKeyWithHighestValue(input);
        assertTrue(result.equals("A") || result.equals("B") || result.equals("C"));
    }
}
