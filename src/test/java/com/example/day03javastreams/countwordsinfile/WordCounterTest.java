package com.example.day03javastreams.countwordsinfile;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.io.*;
import java.nio.file.*;
import java.util.*;

class WordCounterTest {
    private static final String TEST_FILE = "test_text.txt";

    @BeforeEach
    void setup() throws IOException {
        List<String> lines = Arrays.asList(
                "hello world hello",
                "java is great, java is powerful",
                "hello java world"
        );
        Files.write(Paths.get(TEST_FILE), lines);
    }

    @AfterEach
    void cleanup() throws IOException {
        Files.deleteIfExists(Paths.get(TEST_FILE));
    }

    @Test
    void testCountWords() throws IOException {
        Map<String, Integer> wordCountMap = WordCounter.countWords(TEST_FILE);

        assertEquals(3, wordCountMap.get("hello"));
        assertEquals(2, wordCountMap.get("world"));
        assertEquals(3, wordCountMap.get("java"));
        assertEquals(2, wordCountMap.get("is"));
        assertEquals(1, wordCountMap.get("great"));
        assertEquals(1, wordCountMap.get("powerful"));
    }

    @Test
    void testGetTopWords() throws IOException {
        Map<String, Integer> wordCountMap = WordCounter.countWords(TEST_FILE);
        List<Map.Entry<String, Integer>> topWords = WordCounter.getTopWords(wordCountMap, 5);

        assertEquals("hello", topWords.get(0).getKey());
        assertEquals(3, topWords.get(0).getValue());

        assertEquals("java", topWords.get(1).getKey());
        assertEquals(3, topWords.get(1).getValue());

        assertEquals("world", topWords.get(2).getKey());
        assertEquals(2, topWords.get(2).getValue());

        assertEquals("is", topWords.get(3).getKey());
        assertEquals(2, topWords.get(3).getValue());
    }
}

