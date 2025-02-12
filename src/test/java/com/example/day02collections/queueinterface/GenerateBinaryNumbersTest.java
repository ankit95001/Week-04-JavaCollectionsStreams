package com.example.day02collections.queueinterface;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class GenerateBinaryNumbersTest {

    @Test
    void testGenerateBinaryNumbers() {
        List<String> result = GenerateBinaryNumbers.generateBinaryNumbers(5);
        assertNotNull(result);
        assertEquals(5, result.size());
        assertEquals(List.of("1", "10", "11", "100", "101"), result);
    }

    @Test
    void testGenerateBinaryNumbersZero() {
        List<String> result = GenerateBinaryNumbers.generateBinaryNumbers(0);
        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    @Test
    void testGenerateBinaryNumbersOne() {
        List<String> result = GenerateBinaryNumbers.generateBinaryNumbers(1);
        assertNotNull(result);
        assertEquals(List.of("1"), result);
    }

    @Test
    void testGenerateBinaryNumbersLargeInput() {
        List<String> result = GenerateBinaryNumbers.generateBinaryNumbers(10);
        assertNotNull(result);
        assertEquals(10, result.size());
        assertEquals(List.of("1", "10", "11", "100", "101", "110", "111", "1000", "1001", "1010"), result);
    }
}
