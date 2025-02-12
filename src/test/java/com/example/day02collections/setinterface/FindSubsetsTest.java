package com.example.day02collections.setinterface;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class FindSubsetsTest {

    @Test
    void testIsSubset_whenSubsetExists() {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(2, 3));
        assertTrue(FindSubsets.isSubset(set1, set2));
    }

    @Test
    void testIsSubset_whenNotSubset() {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(5, 6));
        assertFalse(FindSubsets.isSubset(set1, set2));
    }

    @Test
    void testIsSubset_whenSet2IsEmpty() {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        Set<Integer> set2 = new HashSet<>();
        assertTrue(FindSubsets.isSubset(set1, set2)); // Empty set is always a subset
    }

    @Test
    void testIsSubset_whenSet1IsEmpty() {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>(Arrays.asList(1, 2));
        assertFalse(FindSubsets.isSubset(set1, set2)); // Non-empty set can't be a subset of an empty set
    }

    @Test
    void testIsSubset_whenBothSetsAreEqual() {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(1, 2, 3));
        assertTrue(FindSubsets.isSubset(set1, set2));
    }
}
