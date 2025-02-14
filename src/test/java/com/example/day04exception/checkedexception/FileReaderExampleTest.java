package com.example.day04exception.checkedexception;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderExampleTest {

    @Test
    public void testFileExists() throws IOException {
        String fileName = "src/test/java/com/example/day04exception/checkedexception/testfile.txt";
        FileWriter writer = new FileWriter(fileName);
        writer.write("Hello, world!");
        writer.close();

        FileReaderExample fileReader = new FileReaderExample();
        assertEquals("Hello, world!", fileReader.readFile(fileName));
    }

    @Test
    public void testFileNotFound() {
        FileReaderExample fileReader = new FileReaderExample();
        assertEquals("File not found", fileReader.readFile("nonexistent.txt"));
    }
}
