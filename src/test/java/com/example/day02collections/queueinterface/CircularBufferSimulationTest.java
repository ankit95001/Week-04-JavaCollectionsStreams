package com.example.day02collections.queueinterface;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class CircularBufferSimulationTest {

    @Test
    void testInsertAndRetrieve() {
        CircularBufferSimulation.CircularBuffer buffer = new CircularBufferSimulation.CircularBuffer(3);
        buffer.insert(1);
        buffer.insert(2);
        buffer.insert(3);
        assertEquals(List.of(1, 2, 3), buffer.getBuffer());
    }

    @Test
    void testInsertOverCapacity() {
        CircularBufferSimulation.CircularBuffer buffer = new CircularBufferSimulation.CircularBuffer(3);
        buffer.insert(1);
        buffer.insert(2);
        buffer.insert(3);
        buffer.insert(4); // This should overwrite the oldest element (1)
        assertEquals(List.of(2, 3, 4), buffer.getBuffer());
    }

    @Test
    void testInsertWithSingleCapacity() {
        CircularBufferSimulation.CircularBuffer buffer = new CircularBufferSimulation.CircularBuffer(1);
        buffer.insert(5);
        assertEquals(List.of(5), buffer.getBuffer());
        buffer.insert(6);
        assertEquals(List.of(6), buffer.getBuffer()); // Overwrites 5
    }

    @Test
    void testEmptyBuffer() {
        CircularBufferSimulation.CircularBuffer buffer = new CircularBufferSimulation.CircularBuffer(3);
        assertTrue(buffer.getBuffer().isEmpty());
    }
}
