package com.example.day02collections.mapinterface;

import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class InvertMapTest {

    @Test
    void testInvertMapWithUniqueValues() {
        Map<String, Integer> input = Map.of("A", 1, "B", 2, "C", 3);
        Map<Integer, List<String>> expected = Map.of(
                1, List.of("A"),
                2, List.of("B"),
                3, List.of("C")
        );
        assertEquals(expected, InvertMap.invertMap(input));
    }

    @Test
    void testInvertMapWithDuplicateValues() {
        Map<String, Integer> input = Map.of("A", 1, "B", 2, "C", 1, "D", 2, "E", 3);
        Map<Integer, List<String>> expected = new HashMap<>();
        expected.put(1, List.of("A", "C"));
        expected.put(2, List.of("B", "D"));
        expected.put(3, List.of("E"));

        assertEquals(expected, InvertMap.invertMap(input));
    }

    @Test
    void testInvertMapWithEmptyMap() {
        Map<String, Integer> input = new HashMap<>();
        Map<Integer, List<String>> expected = new HashMap<>();
        assertEquals(expected, InvertMap.invertMap(input));
    }

    @Test
    void testInvertMapWithSingleEntry() {
        Map<String, Integer> input = Map.of("X", 42);
        Map<Integer, List<String>> expected = Map.of(42, List.of("X"));
        assertEquals(expected, InvertMap.invertMap(input));
    }
}
