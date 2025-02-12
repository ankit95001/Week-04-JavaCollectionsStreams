package com.example.day02collections.mapinterface;

import org.junit.jupiter.api.Test;
import java.util.Map;
import java.util.HashMap;
import static org.junit.jupiter.api.Assertions.*;

class MergeTwoMapsTest {

    @Test
    void testMergeMapsWithCommonKeys() {
        Map<String, Integer> map1 = Map.of("A", 1, "B", 2);
        Map<String, Integer> map2 = Map.of("B", 3, "C", 4);
        Map<String, Integer> expected = Map.of("A", 1, "B", 5, "C", 4);

        assertEquals(expected, MergeTwoMaps.mergeMaps(map1, map2));
    }

    @Test
    void testMergeMapsWithNoCommonKeys() {
        Map<String, Integer> map1 = Map.of("X", 10, "Y", 20);
        Map<String, Integer> map2 = Map.of("A", 30, "B", 40);
        Map<String, Integer> expected = Map.of("X", 10, "Y", 20, "A", 30, "B", 40);

        assertEquals(expected, MergeTwoMaps.mergeMaps(map1, map2));
    }

    @Test
    void testMergeMapsWithEmptyFirstMap() {
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = Map.of("A", 5, "B", 10);
        Map<String, Integer> expected = Map.of("A", 5, "B", 10);

        assertEquals(expected, MergeTwoMaps.mergeMaps(map1, map2));
    }

    @Test
    void testMergeMapsWithEmptySecondMap() {
        Map<String, Integer> map1 = Map.of("A", 5, "B", 10);
        Map<String, Integer> map2 = new HashMap<>();
        Map<String, Integer> expected = Map.of("A", 5, "B", 10);

        assertEquals(expected, MergeTwoMaps.mergeMaps(map1, map2));
    }

    @Test
    void testMergeMapsWithBothEmptyMaps() {
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();
        Map<String, Integer> expected = new HashMap<>();

        assertEquals(expected, MergeTwoMaps.mergeMaps(map1, map2));
    }

    @Test
    void testMergeMapsWithNegativeValues() {
        Map<String, Integer> map1 = Map.of("A", -5, "B", -10);
        Map<String, Integer> map2 = Map.of("B", -5, "C", -20);
        Map<String, Integer> expected = Map.of("A", -5, "B", -15, "C", -20);

        assertEquals(expected, MergeTwoMaps.mergeMaps(map1, map2));
    }
}
