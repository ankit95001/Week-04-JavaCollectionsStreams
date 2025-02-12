package com.example.day02collections.setinterface;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class SymmetricDifferenceTest {

    @Test
    void testSymmetricDifference_withCommonElements() {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5));
        Set<Integer> expected = new HashSet<>(Arrays.asList(1, 2, 4, 5));
        assertEquals(expected, SymmetricDifference.symmetricDifference(set1, set2));
    }

    @Test
    void testSymmetricDifference_withNoCommonElements() {
        Set<String> set1 = new HashSet<>(Arrays.asList("A", "B"));
        Set<String> set2 = new HashSet<>(Arrays.asList("C", "D"));
        Set<String> expected = new HashSet<>(Arrays.asList("A", "B", "C", "D"));
        assertEquals(expected, SymmetricDifference.symmetricDifference(set1, set2));
    }

    @Test
    void testSymmetricDifference_withIdenticalSets() {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> expected = new HashSet<>();
        assertEquals(expected, SymmetricDifference.symmetricDifference(set1, set2));
    }

    @Test
    void testSymmetricDifference_withEmptySet() {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>();
        assertEquals(set1, SymmetricDifference.symmetricDifference(set1, set2));
    }

    @Test
    void testSymmetricDifference_bothEmptySets() {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        Set<Integer> expected = new HashSet<>();
        assertEquals(expected, SymmetricDifference.symmetricDifference(set1, set2));
    }
}
