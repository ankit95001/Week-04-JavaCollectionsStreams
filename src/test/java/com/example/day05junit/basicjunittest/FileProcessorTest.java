package com.example.day05junit.basicjunittest;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class FileProcessorTest {

    private final FileProcessor processor = new FileProcessor();
    private final String testFile = "testfile.txt";

    @BeforeEach
    void setup() throws IOException {
        // Ensure test file does not exist before each test
        Files.deleteIfExists(Path.of(testFile));
    }

    @AfterEach
    void cleanup() throws IOException {
        // Delete test file after each test
        Files.deleteIfExists(Path.of(testFile));
    }

    @Test
    void testWriteAndReadFile() throws IOException {
        String content = "JUnit test for file handling";
        processor.writeToFile(testFile, content);

        String readContent = processor.readFromFile(testFile);
        assertEquals(content, readContent, "Content read should match content written");
    }

    @Test
    void testFileExistsAfterWrite() throws IOException {
        processor.writeToFile(testFile, "Some content");
        assertTrue(Files.exists(Path.of(testFile)), "File should exist after writing");
    }

    @Test
    void testReadNonExistentFileThrowsException() {
        assertThrows(IOException.class, () -> processor.readFromFile("nonexistent.txt"));
    }
}

