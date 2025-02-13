package com.example.day03javastreams.bytearraystream;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.io.*;
import java.nio.file.*;

class ImageByteArrayConverterTest {
    private static final String TEST_IMAGE = "com/example/day03javastreams/bytearraystream/test_input.jpg";
    private static final String OUTPUT_IMAGE = "com/example/day03javastreams/bytearraystream/test_output.jpg";

    @BeforeEach
    void setup() throws IOException {
        byte[] sampleImage = new byte[]{(byte) 255, (byte) 216, (byte) 255, (byte) 224}; // Sample JPEG header
        Files.write(Paths.get(TEST_IMAGE), sampleImage);
    }

    @AfterEach
    void cleanup() throws IOException {
        Files.deleteIfExists(Paths.get(TEST_IMAGE));
        Files.deleteIfExists(Paths.get(OUTPUT_IMAGE));
    }

    @Test
    void testImageToByteArrayAndBack() throws IOException {
        byte[] imageBytes = ImageByteArrayConverter.imageToByteArray(TEST_IMAGE);
        assertNotNull(imageBytes);
        assertTrue(imageBytes.length > 0);

        ImageByteArrayConverter.byteArrayToImage(imageBytes, OUTPUT_IMAGE);
        assertTrue(Files.exists(Paths.get(OUTPUT_IMAGE)));

        byte[] outputBytes = Files.readAllBytes(Paths.get(OUTPUT_IMAGE));
        assertArrayEquals(imageBytes, outputBytes);
    }
}

