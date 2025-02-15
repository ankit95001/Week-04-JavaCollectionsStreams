package com.example.day05regex.advancedproblems;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.Arrays;

public class ProgrammingLanguageExtractorTest {

    @Test
    void testExtractLanguages() {
        String text = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";
        List<String> expected = Arrays.asList("Java", "Python", "JavaScript", "Go");
        assertEquals(expected, ProgrammingLanguageExtractor.extractLanguages(text));
    }

    @Test
    void testNoLanguagesFound() {
        String text = "I enjoy cooking and playing soccer.";
        List<String> expected = Arrays.asList();
        assertEquals(expected, ProgrammingLanguageExtractor.extractLanguages(text));
    }

    @Test
    void testMixedCaseLanguages() {
        String text = "c++ and JAVA are great languages.";
        List<String> expected = Arrays.asList("JAVA");
    }

    @Test
    void testMultipleOccurrences() {
        String text = "Python, Java, Java, Python, Go";
        List<String> expected = Arrays.asList("Python", "Java", "Java", "Python", "Go");
        assertEquals(expected, ProgrammingLanguageExtractor.extractLanguages(text));
    }
}

