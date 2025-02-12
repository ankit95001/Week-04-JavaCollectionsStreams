package com.example.day02collections.setinterface;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class SortedListTest {

    @Test
    void testConvertSetToSortedList_withUnsortedSet() {
        Set<Integer> unsortedSet = new HashSet<>(Arrays.asList(5, 3, 9, 1));
        List<Integer> expected = Arrays.asList(1, 3, 5, 9);
        assertEquals(expected, SortedList.convertSetToSortedList(unsortedSet));
    }

    @Test
    void testConvertSetToSortedList_withAlreadySortedSet() {
        Set<Integer> sortedSet = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5);
        assertEquals(expected, SortedList.convertSetToSortedList(sortedSet));
    }

    @Test
    void testConvertSetToSortedList_withSingleElementSet() {
        Set<Integer> singleElementSet = new HashSet<>(Collections.singletonList(7));
        List<Integer> expected = Collections.singletonList(7);
        assertEquals(expected, SortedList.convertSetToSortedList(singleElementSet));
    }

    @Test
    void testConvertSetToSortedList_withEmptySet() {
        Set<Integer> emptySet = new HashSet<>();
        List<Integer> expected = new ArrayList<>();
        assertEquals(expected, SortedList.convertSetToSortedList(emptySet));
    }

    @Test
    void testConvertSetToSortedList_withNegativeNumbers() {
        Set<Integer> negativeSet = new HashSet<>(Arrays.asList(-1, -5, -3, 2, 0));
        List<Integer> expected = Arrays.asList(-5, -3, -1, 0, 2);
        assertEquals(expected, SortedList.convertSetToSortedList(negativeSet));
    }
}
