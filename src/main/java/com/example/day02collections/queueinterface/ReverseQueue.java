package com.example.day02collections.queueinterface;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {
    public static <T> Queue<T> reverseQueue(Queue<T> queue) {
        Stack<T> stack = new Stack<>();
        while (!queue.isEmpty()) {
            stack.push(queue.poll());
        }
        while (!stack.isEmpty()) {
            queue.offer(stack.pop());
        }
        return queue;
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>(Arrays.asList(10, 20, 30));
        System.out.println("Reversed Queue: " + reverseQueue(queue));

        Queue<String> queueString = new LinkedList<>(Arrays.asList("Ankit", "Aakrati", "Anand"));
        System.out.println("Reversed Queue: " + reverseQueue(queueString));
    }
}
