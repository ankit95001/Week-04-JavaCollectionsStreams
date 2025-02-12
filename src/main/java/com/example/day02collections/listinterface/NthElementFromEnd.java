package com.example.day02collections.listinterface;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class NthElementFromEnd {
    public static <T> T findNthFromEnd(LinkedList<T> list, int n) {
        Iterator<T> fast = list.iterator();
        Iterator<T> slow = list.iterator();

        for (int i = 0; i < n; i++) {
            if (fast.hasNext()) fast.next();
            else return null;
        }

        while (fast.hasNext()) {
            fast.next();
            slow.next();
        }
        return slow.next();
    }

    public static void main(String[] args) {
        LinkedList<String> linkedList2 = new LinkedList<>(Arrays.asList("A", "B", "C", "D", "E"));
        System.out.println("Nth from end: " + findNthFromEnd(linkedList2, 2));
    }
}
