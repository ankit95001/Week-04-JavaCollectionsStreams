package com.example.day02collections.queueinterface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class GenerateBinaryNumbers {
    public static List<String> generateBinaryNumbers(int N) {
        List<String> result = new ArrayList<>();
        Queue<String> queue = new LinkedList<>();
        queue.offer("1");
        while (N-- > 0) {
            String binary = queue.poll();
            result.add(binary);
            queue.offer(binary + "0");
            queue.offer(binary + "1");
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Binary Numbers: " + generateBinaryNumbers(5));
    }
}
