package com.example.day05regex.replaceandmodifystrings;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

public class BadWordCensorTest {

    @Test
    void testCensorBadWords() {
        String text = "This is a damn bad example with some stupid words.";
        List<String> badWords = Arrays.asList("damn", "stupid");
        String expected = "This is a **** bad example with some **** words.";
        assertEquals(expected, BadWordCensor.censorBadWords(text, badWords));
    }

    @Test
    void testNoBadWords() {
        String text = "This is a clean example.";
        List<String> badWords = Arrays.asList("damn", "stupid");
        assertEquals(text, BadWordCensor.censorBadWords(text, badWords));
    }

    @Test
    void testCensorCaseInsensitive() {
        String text = "This is a Damn bad example with some Stupid words.";
        List<String> badWords = Arrays.asList("damn", "stupid");
        String expected = "This is a **** bad example with some **** words.";
        assertEquals(expected, BadWordCensor.censorBadWords(text, badWords));
    }

    @Test
    void testCensorPartialMatches() {
        String text = "The stupidity of this is beyond measure.";
        List<String> badWords = Arrays.asList("stupid");
        String expected = "The stupidity of this is beyond measure."; // "stupid" should not match inside words
        assertEquals(expected, BadWordCensor.censorBadWords(text, badWords));
    }
}

