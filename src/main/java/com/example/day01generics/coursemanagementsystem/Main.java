package com.example.day01generics.coursemanagementsystem;

import java.util.List;

public class Main {
    public static void displayCourses(List<? extends CourseType> courses) {
        courses.forEach(System.out::println);
    }
    public static void main(String[] args) {
        Course<ExamCourse> examCourseCatalog = new Course<>();
        examCourseCatalog.addCourse(new ExamCourse("Mathematics", "Dr. Smith"));
        examCourseCatalog.addCourse(new ExamCourse("Physics", "Dr. Johnson"));

        Course<AssignmentCourse> assignmentCourseCatalog = new Course<>();
        assignmentCourseCatalog.addCourse(new AssignmentCourse("Software Engineering", "Prof. Williams"));
        assignmentCourseCatalog.addCourse(new AssignmentCourse("Data Structures", "Dr. Brown"));

        Course<ResearchCourse> researchCourseCatalog = new Course<>();
        researchCourseCatalog.addCourse(new ResearchCourse("AI Research", "Dr. White"));
        researchCourseCatalog.addCourse(new ResearchCourse("Quantum Computing", "Prof. Taylor"));

        // Display courses dynamically
        System.out.println("Exam-Based Courses:");
        displayCourses(examCourseCatalog.getCourses());

        System.out.println("\nAssignment-Based Courses:");
        displayCourses(assignmentCourseCatalog.getCourses());

        System.out.println("\nResearch-Based Courses:");
        displayCourses(researchCourseCatalog.getCourses());
    }
}
