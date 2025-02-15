package com.example.day05regex.extractionproblems;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.List;

public class LinkExtractorTest {

    @Test
    void testExtractLinks() {
        String text = "Visit https://www.google.com and http://example.org for more info.";
        List<String> links = LinkExtractor.extractLinks(text);

        assertEquals(2, links.size());
        assertTrue(links.contains("https://www.google.com"));
        assertTrue(links.contains("http://example.org"));
    }

    @Test
    void testNoLinks() {
        String text = "There are no links in this text.";
        List<String> links = LinkExtractor.extractLinks(text);

        assertTrue(links.isEmpty());
    }

    @Test
    void testLinksWithPathsAndQueries() {
        String text = "Check https://example.com/path/to/page?query=123 and http://sub.domain.org/home.";
        List<String> links = LinkExtractor.extractLinks(text);

        assertEquals(2, links.size());
        assertTrue(links.contains("https://example.com/path/to/page?query=123"));
        assertTrue(links.contains("http://sub.domain.org/home"));
    }

    @Test
    void testLinksWithDifferentTLDs() {
        String text = "Visit https://site.co.uk and http://domain.info/page.";
        List<String> links = LinkExtractor.extractLinks(text);

        assertEquals(2, links.size());
        assertTrue(links.contains("https://site.co.uk"));
        assertTrue(links.contains("http://domain.info/page"));
    }
}

