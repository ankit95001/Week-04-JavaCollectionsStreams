package com.example.day02collections.queueinterface;

import java.util.ArrayList;
import java.util.List;

public class CircularBufferSimulation {
    static class CircularBuffer {
        int[] buffer;
        int size, head, tail;

        public CircularBuffer(int capacity) {
            buffer = new int[capacity];
            size = 0;
            head = 0;
            tail = 0;
        }

        public void insert(int value) {
            buffer[tail] = value;
            tail = (tail + 1) % buffer.length;
            if (size < buffer.length) {
                size++;
            } else {
                head = (head + 1) % buffer.length;
            }
        }

        public List<Integer> getBuffer() {
            List<Integer> result = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                result.add(buffer[(head + i) % buffer.length]);
            }
            return result;
        }
    }

    public static void main(String[] args) {
        CircularBuffer buffer = new CircularBuffer(3);
        buffer.insert(1);
        buffer.insert(2);
        buffer.insert(3);
        buffer.insert(4);
        System.out.println("Circular Buffer: " + buffer.getBuffer());
    }
}
