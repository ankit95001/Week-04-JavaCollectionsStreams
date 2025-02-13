package com.example.day03javastreams.readuserinputfromconsole;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.io.*;
import java.nio.file.*;

class UserInputToFileTest {
    private static final String TEST_FILE = "test_user_input.txt";

    @AfterEach
    void cleanup() throws IOException {
        Files.deleteIfExists(Paths.get(TEST_FILE));
    }

    @Test
    void testSaveUserInput() throws IOException {
        String simulatedInput = "Alice\n25\nJava\n";
        InputStream inputStream = new ByteArrayInputStream(simulatedInput.getBytes());
        System.setIn(inputStream);

        UserInputToFile.saveUserInput(TEST_FILE);

        assertTrue(Files.exists(Paths.get(TEST_FILE)));
        String content = Files.readString(Paths.get(TEST_FILE));
        assertTrue(content.contains("Name: Alice"));
        assertTrue(content.contains("Age: 25"));
        assertTrue(content.contains("Favorite Language: Java"));
    }
}

