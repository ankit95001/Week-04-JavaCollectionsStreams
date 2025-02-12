package com.example.day02collections.queueinterface;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StackAndQueueTest {

    @Test
    void testPushAndPop() {
        StackAndQueue.StackUsingQueues stack = new StackAndQueue.StackUsingQueues();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertEquals(3, stack.pop());
        assertEquals(2, stack.pop());
        assertEquals(1, stack.pop());
    }

    @Test
    void testTop() {
        StackAndQueue.StackUsingQueues stack = new StackAndQueue.StackUsingQueues();
        stack.push(5);
        stack.push(10);
        assertEquals(10, stack.top());
        stack.pop();
        assertEquals(5, stack.top());
    }

    @Test
    void testPopOnEmptyStack() {
        StackAndQueue.StackUsingQueues stack = new StackAndQueue.StackUsingQueues();
        assertNull(stack.pop());
    }

    @Test
    void testTopOnEmptyStack() {
        StackAndQueue.StackUsingQueues stack = new StackAndQueue.StackUsingQueues();
        assertNull(stack.top());
    }
}
