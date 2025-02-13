package com.example.day03javastreams.datastreams;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.io.*;
import java.nio.file.*;

class StudentDataHandlerTest {
    private static final String TEST_FILE = "test_student_data.dat";

    @AfterEach
    void cleanup() throws IOException {
        Files.deleteIfExists(Paths.get(TEST_FILE));
    }

    @Test
    void testSaveAndRetrieveStudentData() throws IOException {
        Student student = new Student(102, "Bob", 3.9);
        StudentDataHandler.saveStudentData(student, TEST_FILE);
        assertTrue(Files.exists(Paths.get(TEST_FILE)));

        Student retrievedStudent = StudentDataHandler.retrieveStudentData(TEST_FILE);
        assertNotNull(retrievedStudent);
        assertEquals(student.getRollNumber(), retrievedStudent.getRollNumber());
        assertEquals(student.getName(), retrievedStudent.getName());
        assertEquals(student.getGpa(), retrievedStudent.getGpa(), 0.001);
    }
}

