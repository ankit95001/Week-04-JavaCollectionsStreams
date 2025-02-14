package com.example.day04exception.trywithresources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public void readFirstLine(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String firstLine = reader.readLine();
            System.out.println("First line: " + (firstLine != null ? firstLine : "File is empty"));
        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }

    public static void main(String[] args) {
        FileReaderExample fileReader = new FileReaderExample();

        String validFilePath = "src/main/java/com/example/day04exception/trywithresources/info.txt";
        String invalidFilePath = "src/main/java/com/example/day04exception/trywithresources/missing.txt";

        fileReader.readFirstLine(validFilePath);
        fileReader.readFirstLine(invalidFilePath);
    }
}

