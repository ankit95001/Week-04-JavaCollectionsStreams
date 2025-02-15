package com.example.day05regex.extractionproblems;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.List;

public class EmailExtractorTest {

    @Test
    void testExtractEmails() {
        String text = "Contact us at support@example.com and info@company.org";
        List<String> emails = EmailExtractor.extractEmails(text);

        assertEquals(2, emails.size());
        assertTrue(emails.contains("support@example.com"));
        assertTrue(emails.contains("info@company.org"));
    }

    @Test
    void testNoEmails() {
        String text = "This text has no emails.";
        List<String> emails = EmailExtractor.extractEmails(text);

        assertTrue(emails.isEmpty());
    }

    @Test
    void testEmailsWithDifferentFormats() {
        String text = "Emails: user.name@domain.com, admin@sub.example.org, first_last123@company.net";
        List<String> emails = EmailExtractor.extractEmails(text);

        assertEquals(3, emails.size());
        assertTrue(emails.contains("user.name@domain.com"));
        assertTrue(emails.contains("admin@sub.example.org"));
        assertTrue(emails.contains("first_last123@company.net"));
    }
}

