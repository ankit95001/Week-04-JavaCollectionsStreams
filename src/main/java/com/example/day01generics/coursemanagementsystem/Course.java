package com.example.day01generics.coursemanagementsystem;

import java.util.ArrayList;
import java.util.List;

class Course<T extends CourseType> {
    private List<T> courses = new ArrayList<>();

    public void addCourse(T course) {
        courses.add(course);
    }

    public List<T> getCourses() {
        return new ArrayList<>(courses);
    }
}
