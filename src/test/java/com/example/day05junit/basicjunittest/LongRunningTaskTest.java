package com.example.day05junit.basicjunittest;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongRunningTaskTest {

    private final LongRunningTask task = new LongRunningTask();

    @Test
    @Timeout(value = 2, unit = TimeUnit.SECONDS)
    void testLongRunningTaskTimeout() {
        assertEquals("Task Completed", task.longRunningTask());
    }
}

