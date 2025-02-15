package com.example.day05regex.advancedproblems;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.Arrays;

public class CurrencyExtractorTest {

    @Test
    void testExtractCurrencyValues() {
        String text = "The price is $45.99, and the discount is $10.50.";
        List<String> expected = Arrays.asList("$45.99", "$10.50");
        assertEquals(expected, CurrencyExtractor.extractCurrencyValues(text));
    }

    @Test
    void testWholeNumbersAndDecimals() {
        String text = "$100, $20.99, and $5.75 are the prices.";
        List<String> expected = Arrays.asList("$100", "$20.99", "$5.75");
        assertEquals(expected, CurrencyExtractor.extractCurrencyValues(text));
    }

    @Test
    void testWithWholeDollarAmounts() {
        String text = "$1, $10, and $100 are valid.";
        List<String> expected = Arrays.asList("$1", "$10", "$100");
        assertEquals(expected, CurrencyExtractor.extractCurrencyValues(text));
    }

    @Test

    void testNoCurrencyValues() {
        String text = "This text contains no prices.";
        List<String> expected = Arrays.asList();
        assertEquals(expected, CurrencyExtractor.extractCurrencyValues(text));
    }

    @Test
    void testInvalidValues() {
        String text = "The values are 100 and 50, but not currency.";
        List<String> expected = Arrays.asList();
        assertEquals(expected, CurrencyExtractor.extractCurrencyValues(text));
    }
}

