package com.example.day04exception.checkedexception;

import java.io.*;

public class FileReaderExample {
    public String readFile(String fileName) {
        StringBuilder content = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                content.append(line).append("\n");
            }
        } catch (IOException e) {
            return "File not found";
        }
        return content.toString().trim();
    }

    public static void main(String[] args) {
        FileReaderExample fileReader = new FileReaderExample();
        String result = fileReader.readFile("src/main/java/com/example/day04exception/checkedexception/data.txt");
        System.out.println(result);
    }
}


