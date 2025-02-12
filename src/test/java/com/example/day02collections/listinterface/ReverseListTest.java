package com.example.day02collections.listinterface;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class ReverseListTest {

    private List<Integer> arrayList;
    private List<String> stringList;
    private LinkedList<Integer> linkedList;
    private LinkedList<String> linkedStringList;

    @BeforeEach
    void setUp() {
        arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        stringList = new ArrayList<>(Arrays.asList("Ankit kumar", "Anand Soni", "Aakrati Barsaiyan"));
        linkedList = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        linkedStringList = new LinkedList<>(Arrays.asList("Ankit kumar", "Anand Soni", "Aakrati Barsaiyan"));
    }

    @Test
    void testReverseArrayList_withIntegers() {
        ReverseList.reverseArrayList(arrayList);
        assertEquals(Arrays.asList(5, 4, 3, 2, 1), arrayList);
    }

    @Test
    void testReverseArrayList_withStrings() {
        ReverseList.reverseArrayList(stringList);
        assertEquals(Arrays.asList("Aakrati Barsaiyan", "Anand Soni", "Ankit kumar"), stringList);
    }

    @Test
    void testReverseLinkedList_withIntegers() {
        ReverseList.reverseLinkedList(linkedList);
        assertEquals(Arrays.asList(5, 4, 3, 2, 1), linkedList);
    }

    @Test
    void testReverseLinkedList_withStrings() {
        ReverseList.reverseLinkedList(linkedStringList);
        assertEquals(Arrays.asList("Aakrati Barsaiyan", "Anand Soni", "Ankit kumar"), linkedStringList);
    }

    @Test
    void testReverseEmptyArrayList() {
        List<Integer> emptyList = new ArrayList<>();
        ReverseList.reverseArrayList(emptyList);
        assertTrue(emptyList.isEmpty());
    }

    @Test
    void testReverseEmptyLinkedList() {
        LinkedList<Integer> emptyLinkedList = new LinkedList<>();
        ReverseList.reverseLinkedList(emptyLinkedList);
        assertTrue(emptyLinkedList.isEmpty());
    }
}

