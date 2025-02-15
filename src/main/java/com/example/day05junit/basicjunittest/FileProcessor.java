package com.example.day05junit.basicjunittest;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class FileProcessor {

    public void writeToFile(String filename, String content) throws IOException {
        Files.write(Path.of(filename), content.getBytes(), StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
    }

    public String readFromFile(String filename) throws IOException {
        return Files.readString(Path.of(filename));
    }

    public static void main(String[] args) {
        FileProcessor processor = new FileProcessor();
        String filename = "src/main/java/com/example/day05junit/basicjunittest/testfile.txt";
        String content = "Hello, this is a test.";

        try {
            processor.writeToFile(filename, content);
            System.out.println("Written to file: " + filename);

            String readContent = processor.readFromFile(filename);
            System.out.println("Read from file: " + readContent);
        } catch (IOException e) {
            System.err.println("Error handling file: " + e.getMessage());
        }
    }
}

