package com.example.day02collections.listinterface;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class RotateElementsTest {

    @Test
    void testRotateListPositiveK() {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        RotateElements.rotateList(numbers, 2);
        assertEquals(Arrays.asList(30, 40, 50, 10, 20), numbers);
    }

    @Test
    void testRotateListZeroK() {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        RotateElements.rotateList(numbers, 0);
        assertEquals(Arrays.asList(10, 20, 30, 40, 50), numbers);
    }

    @Test
    void testRotateListKGreaterThanSize() {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        RotateElements.rotateList(numbers, 7); // 7 % 5 = 2
        assertEquals(Arrays.asList(30, 40, 50, 10, 20), numbers);
    }

    @Test
    void testRotateListSingleElement() {
        List<Integer> numbers = new ArrayList<>(List.of(100));
        RotateElements.rotateList(numbers, 3);
        assertEquals(List.of(100), numbers);
    }

    @Test
    void testRotateListEmpty() {
        List<Integer> numbers = new ArrayList<>();
        assertThrows(ArithmeticException.class, () -> RotateElements.rotateList(numbers, 3));
    }
}
