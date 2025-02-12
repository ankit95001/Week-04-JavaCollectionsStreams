package com.example.day02collections.listinterface;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class NthElementFromEndTest {

    @Test
    void testFindNthFromEnd_withValidIndex() {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("A", "B", "C", "D", "E"));
        assertEquals("D", NthElementFromEnd.findNthFromEnd(list, 2));
    }

    @Test
    void testFindNthFromEnd_withFirstElement() {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(10, 20, 30, 40, 50));
        assertEquals(50, NthElementFromEnd.findNthFromEnd(list, 1));
    }

    @Test
    void testFindNthFromEnd_withLastElement() {
        LinkedList<Character> list = new LinkedList<>(Arrays.asList('A', 'B', 'C', 'D'));
        assertEquals('A', NthElementFromEnd.findNthFromEnd(list, 4));
    }

    @Test
    void testFindNthFromEnd_withNGreaterThanSize() {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("X", "Y"));
        assertNull(NthElementFromEnd.findNthFromEnd(list, 3));
    }

    @Test
    void testFindNthFromEnd_withEmptyList() {
        LinkedList<Integer> list = new LinkedList<>();
        assertNull(NthElementFromEnd.findNthFromEnd(list, 1));
    }
}