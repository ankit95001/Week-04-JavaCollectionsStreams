package com.example.day02collections.queueinterface;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import static org.junit.jupiter.api.Assertions.*;

class ReverseQueueTest {
    private Queue<Integer> intQueue;
    private Queue<String> stringQueue;

    @BeforeEach
    void setUp() {
        intQueue = new LinkedList<>(Arrays.asList(10, 20, 30));
        stringQueue = new LinkedList<>(Arrays.asList("Ankit", "Aakrati", "Anand"));
    }

    @Test
    void testReverseIntegerQueue() {
        Queue<Integer> reversedQueue = ReverseQueue.reverseQueue(intQueue);
        assertArrayEquals(new Integer[]{30, 20, 10}, reversedQueue.toArray());
    }

    @Test
    void testReverseStringQueue() {
        Queue<String> reversedQueue = ReverseQueue.reverseQueue(stringQueue);
        assertArrayEquals(new String[]{"Anand", "Aakrati", "Ankit"}, reversedQueue.toArray());
    }

    @Test
    void testReverseEmptyQueue() {
        Queue<Integer> emptyQueue = new LinkedList<>();
        Queue<Integer> reversedQueue = ReverseQueue.reverseQueue(emptyQueue);
        assertTrue(reversedQueue.isEmpty());
    }

    @Test
    void testReverseSingleElementQueue() {
        Queue<Integer> singleQueue = new LinkedList<>(Arrays.asList(100));
        Queue<Integer> reversedQueue = ReverseQueue.reverseQueue(singleQueue);
        assertArrayEquals(new Integer[]{100}, reversedQueue.toArray());
    }
}
