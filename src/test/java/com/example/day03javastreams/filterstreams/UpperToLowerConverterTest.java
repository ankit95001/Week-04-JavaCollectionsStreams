package com.example.day03javastreams.filterstreams;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.io.*;
import java.nio.file.*;

class UpperToLowerConverterTest {
    private static final String INPUT_FILE = "test_input.txt";
    private static final String OUTPUT_FILE = "test_output.txt";

    @BeforeEach
    void setup() throws IOException {
        Files.writeString(Paths.get(INPUT_FILE), "HELLO WORLD\nJAVA PROGRAMMING\nTESTING FILES\n");
    }

    @AfterEach
    void cleanup() throws IOException {
        Files.deleteIfExists(Paths.get(INPUT_FILE));
        Files.deleteIfExists(Paths.get(OUTPUT_FILE));
    }

    @Test
    void testConvertFileToLowercase() throws IOException {
        UpperToLowerConverter.convertFileToLowercase(INPUT_FILE, OUTPUT_FILE);
        assertTrue(Files.exists(Paths.get(OUTPUT_FILE)));

        String content = Files.readString(Paths.get(OUTPUT_FILE));
        assertEquals("hello world\njava programming\ntesting files\n", content);
    }
}

