package com.example.day02collections.setinterface;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class UnionIntersectionTest {

    @Test
    void testUnion_withCommonElements() {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5));
        Set<Integer> expected = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        assertEquals(expected, UnionIntersection.union(set1, set2));
    }

    @Test
    void testUnion_withNoCommonElements() {
        Set<String> set1 = new HashSet<>(Arrays.asList("A", "B"));
        Set<String> set2 = new HashSet<>(Arrays.asList("C", "D"));
        Set<String> expected = new HashSet<>(Arrays.asList("A", "B", "C", "D"));
        assertEquals(expected, UnionIntersection.union(set1, set2));
    }

    @Test
    void testUnion_withEmptySet() {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>();
        assertEquals(set1, UnionIntersection.union(set1, set2));
    }

    @Test
    void testIntersection_withCommonElements() {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5, 6));
        Set<Integer> expected = new HashSet<>(Arrays.asList(3, 4));
        assertEquals(expected, UnionIntersection.intersection(set1, set2));
    }

    @Test
    void testIntersection_withNoCommonElements() {
        Set<String> set1 = new HashSet<>(Arrays.asList("A", "B"));
        Set<String> set2 = new HashSet<>(Arrays.asList("C", "D"));
        Set<String> expected = new HashSet<>();
        assertEquals(expected, UnionIntersection.intersection(set1, set2));
    }

    @Test
    void testIntersection_withEmptySet() {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>();
        Set<Integer> expected = new HashSet<>();
        assertEquals(expected, UnionIntersection.intersection(set1, set2));
    }
}
