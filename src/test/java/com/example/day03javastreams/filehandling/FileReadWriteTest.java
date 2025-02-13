package com.example.day03javastreams.filehandling;
import org.junit.jupiter.api.*;

import java.io.IOException;
import java.nio.file.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class FileReadWriteTest {
    private static final String TEST_SOURCE = "src/test/java/com/example/day03javastreams/filehandling/test_source.txt";
    private static final String TEST_DEST = "src/test/java/com/example/day03javastreams/filehandling/test_dest.txt";

    @BeforeEach
    void setup() throws IOException {
        Files.write(Paths.get(TEST_SOURCE), "Hello, World!".getBytes());
    }

    @AfterEach
    void cleanup() throws IOException {
        Files.deleteIfExists(Paths.get(TEST_SOURCE));
        Files.deleteIfExists(Paths.get(TEST_DEST));
    }

    @Test
    void testCopyFile() throws IOException {
        FileReadWrite.copyFile(TEST_SOURCE, TEST_DEST);
        assertTrue(Files.exists(Paths.get(TEST_DEST)));
        assertEquals(Files.readString(Paths.get(TEST_SOURCE)), Files.readString(Paths.get(TEST_DEST)));
    }


}
