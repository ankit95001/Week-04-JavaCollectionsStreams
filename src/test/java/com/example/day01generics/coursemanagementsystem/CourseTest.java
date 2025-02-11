package com.example.day01generics.coursemanagementsystem;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

class CourseTest {

    @Test
    void testAddCourse() {
        Course<ExamCourse> examCourseCatalog = new Course<>();
        ExamCourse course = new ExamCourse("Mathematics", "Dr. Smith");

        examCourseCatalog.addCourse(course);

        List<ExamCourse> courses = examCourseCatalog.getCourses();
        assertEquals(1, courses.size());
        assertEquals("Mathematics", courses.get(0).getCourseName());
        assertEquals("Dr. Smith", courses.get(0).getInstructor());
    }

    @Test
    void testMultipleCourses() {
        Course<AssignmentCourse> assignmentCourseCatalog = new Course<>();
        AssignmentCourse course1 = new AssignmentCourse("Software Engineering", "Prof. Williams");
        AssignmentCourse course2 = new AssignmentCourse("Data Structures", "Dr. Brown");

        assignmentCourseCatalog.addCourse(course1);
        assignmentCourseCatalog.addCourse(course2);

        List<AssignmentCourse> courses = assignmentCourseCatalog.getCourses();
        assertEquals(2, courses.size());
        assertEquals("Software Engineering", courses.get(0).getCourseName());
        assertEquals("Data Structures", courses.get(1).getCourseName());
    }

    @Test
    void testToString() {
        ResearchCourse researchCourse = new ResearchCourse("AI Research", "Dr. White");
        String expectedOutput = "ResearchCourse - Course: AI Research, Instructor: Dr. White";

        assertEquals(expectedOutput, researchCourse.toString());
    }
}
