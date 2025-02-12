package com.example.day02collections.listinterface;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class FindFrequencyElementsTest {

    @Test
    void testCountFrequency_withStrings() {
        List<String> words = Arrays.asList("apple", "banana", "apple", "orange");
        Map<String, Integer> expected = new HashMap<>();
        expected.put("apple", 2);
        expected.put("banana", 1);
        expected.put("orange", 1);

        assertEquals(expected, FindFrequencyElements.countFrequency(words));
    }

    @Test
    void testCountFrequency_withIntegers() {
        List<Integer> numbers = Arrays.asList(1, 2, 1, 2, 5, 1, 2, 4, 5, 2, 3);
        Map<Integer, Integer> expected = new HashMap<>();
        expected.put(1, 3);
        expected.put(2, 4);
        expected.put(5, 2);
        expected.put(4, 1);
        expected.put(3, 1);

        assertEquals(expected, FindFrequencyElements.countFrequency(numbers));
    }

    @Test
    void testCountFrequency_withEmptyList() {
        List<String> emptyList = Collections.emptyList();
        Map<String, Integer> expected = new HashMap<>();

        assertEquals(expected, FindFrequencyElements.countFrequency(emptyList));
    }

    @Test
    void testCountFrequency_withSingleElementList() {
        List<String> singleElementList = Collections.singletonList("apple");
        Map<String, Integer> expected = new HashMap<>();
        expected.put("apple", 1);

        assertEquals(expected, FindFrequencyElements.countFrequency(singleElementList));
    }
}
