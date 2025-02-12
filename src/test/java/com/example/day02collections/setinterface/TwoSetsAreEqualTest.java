package com.example.day02collections.setinterface;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class TwoSetsAreEqualTest {

    @Test
    void testCheck_equalSets() {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 2, 1));
        assertTrue(TwoSetsAreEqual.check(set1, set2));
    }

    @Test
    void testCheck_differentSets() {
        Set<String> set1 = new HashSet<>(Arrays.asList("apple", "banana"));
        Set<String> set2 = new HashSet<>(Arrays.asList("banana", "orange"));
        assertFalse(TwoSetsAreEqual.check(set1, set2));
    }

    @Test
    void testCheck_setsWithDifferentSizes() {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        assertFalse(TwoSetsAreEqual.check(set1, set2));
    }

    @Test
    void testCheck_emptySets() {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        assertTrue(TwoSetsAreEqual.check(set1, set2));
    }

    @Test
    void testCheck_oneEmptySet() {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>(Arrays.asList(1, 2, 3));
        assertFalse(TwoSetsAreEqual.check(set1, set2));
    }
}
