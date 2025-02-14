package com.example.day04exception.trywithresources;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.*;

public class FileReaderExampleTest {

    @Test
    public void testValidFile() throws IOException {
        // Create a temporary test file
        File testFile = File.createTempFile("testFile", ".txt");
        try (FileWriter writer = new FileWriter(testFile)) {
            writer.write("Hello, World!\nSecond line");
        }

        FileReaderExample fileReader = new FileReaderExample();
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        fileReader.readFirstLine(testFile.getAbsolutePath());

        assertTrue(output.toString().trim().contains("First line: Hello, World!"));
    }

    @Test
    public void testFileNotFound() {
        FileReaderExample fileReader = new FileReaderExample();
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        fileReader.readFirstLine("non_existent_file.txt");

        assertTrue(output.toString().trim().contains("Error reading file"));
    }
}
