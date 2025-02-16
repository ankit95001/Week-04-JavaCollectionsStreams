package com.example.reflection.methodexecutiontiming;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class MainTest {

    @Test
    void testQuickTaskExecution() {
        assertDoesNotThrow(() -> Main.measureExecutionTime(TaskProcessor.class, "quickTask"));
    }

    @Test
    void testLongTaskExecution() {
        assertDoesNotThrow(() -> Main.measureExecutionTime(TaskProcessor.class, "longTask"));
    }
}

