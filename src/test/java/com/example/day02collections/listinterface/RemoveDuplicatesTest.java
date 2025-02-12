package com.example.day02collections.listinterface;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesTest {

    @Test
    void testRemoveDuplicates_withIntegers() {
        List<Integer> numbers = Arrays.asList(3, 1, 2, 2, 3, 4);
        List<Integer> expected = Arrays.asList(3, 1, 2, 4);
        assertEquals(expected, RemoveDuplicates.removeDuplicates(numbers));
    }

    @Test
    void testRemoveDuplicates_withStrings() {
        List<String> words = Arrays.asList("apple", "banana", "apple", "orange");
        List<String> expected = Arrays.asList("apple", "banana", "orange");
        assertEquals(expected, RemoveDuplicates.removeDuplicates(words));
    }

    @Test
    void testRemoveDuplicates_withEmptyList() {
        List<String> emptyList = Collections.emptyList();
        List<String> expected = Collections.emptyList();
        assertEquals(expected, RemoveDuplicates.removeDuplicates(emptyList));
    }

    @Test
    void testRemoveDuplicates_withSingleElementList() {
        List<Integer> singleElementList = Collections.singletonList(5);
        List<Integer> expected = Collections.singletonList(5);
        assertEquals(expected, RemoveDuplicates.removeDuplicates(singleElementList));
    }
}
