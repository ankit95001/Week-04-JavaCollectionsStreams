package com.example.day05junit.advancedjunitpracticeproblems;

import org.junit.jupiter.api.Test;
import java.text.ParseException;
import static org.junit.jupiter.api.Assertions.*;

class DateFormatterTest {

    @Test
    void testValidDateFormat() throws ParseException {
        assertEquals("15-02-2025", DateFormatter.formatDate("2025-02-15"));
        assertEquals("01-01-2000", DateFormatter.formatDate("2000-01-01"));
    }

    @Test
    void testInvalidDateFormat() {
        assertThrows(ParseException.class, () -> DateFormatter.formatDate("15-02-2025"));
        assertThrows(ParseException.class, () -> DateFormatter.formatDate("2025/02/15"));
        assertThrows(ParseException.class, () -> DateFormatter.formatDate("InvalidDate"));
    }
}

