package com.example.day05regex.extractionproblems;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.List;

public class DateExtractorTest {

    @Test
    void testExtractDates() {
        String text = "The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020.";
        List<String> dates = DateExtractor.extractDates(text);

        assertEquals(3, dates.size());
        assertTrue(dates.contains("12/05/2023"));
        assertTrue(dates.contains("15/08/2024"));
        assertTrue(dates.contains("29/02/2020"));
    }

    @Test
    void testNoDates() {
        String text = "There are no dates in this text.";
        List<String> dates = DateExtractor.extractDates(text);

        assertTrue(dates.isEmpty());
    }

    @Test
    void testInvalidDates() {
        String text = "Invalid dates like 32/01/2023, 15/13/2022, 00/10/2020 should not be detected.";
        List<String> dates = DateExtractor.extractDates(text);

        assertTrue(dates.isEmpty()); // These are invalid dates
    }

    @Test
    void testValidLeapYearDate() {
        String text = "Valid leap year date: 29/02/2024.";
        List<String> dates = DateExtractor.extractDates(text);

        assertEquals(1, dates.size());
        assertTrue(dates.contains("29/02/2024"));
    }
}

