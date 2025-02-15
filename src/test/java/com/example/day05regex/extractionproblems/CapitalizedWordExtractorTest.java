package com.example.day05regex.extractionproblems;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.List;

public class CapitalizedWordExtractorTest {

    @Test
    void testExtractCapitalizedWords() {
        String text = "The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";
        List<String> words = CapitalizedWordExtractor.extractCapitalizedWords(text);

        assertEquals(8, words.size());
        assertTrue(words.contains("Eiffel"));
        assertTrue(words.contains("Tower"));
        assertTrue(words.contains("Paris"));
        assertTrue(words.contains("Statue"));
        assertTrue(words.contains("Liberty"));
        assertTrue(words.contains("New"));
        assertTrue(words.contains("York"));
    }

    @Test
    void testNoCapitalizedWords() {
        String text = "this sentence has no capitalized words.";
        List<String> words = CapitalizedWordExtractor.extractCapitalizedWords(text);

        assertTrue(words.isEmpty());
    }

    @Test
    void testSingleCapitalizedWord() {
        String text = "Only One.";
        List<String> words = CapitalizedWordExtractor.extractCapitalizedWords(text);

        assertEquals(2, words.size());
        assertTrue(words.contains("One"));
    }
}

