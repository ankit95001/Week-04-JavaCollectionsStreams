package com.example.day03javastreams.filterstreams;

import java.io.*;

public class UpperToLowerConverter {
    public static void convertFileToLowercase(String inputFile, String outputFile) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line.toLowerCase());
                writer.newLine();
            }
        }
    }

    public static void main(String[] args) {
        String inputFile = "src/main/java/com/example/day03javastreams/filterstreams/input.txt";
        String outputFile = "src/main/java/com/example/day03javastreams/filterstreams/output.txt";

        try {
            convertFileToLowercase(inputFile, outputFile);
            System.out.println("File conversion completed successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

