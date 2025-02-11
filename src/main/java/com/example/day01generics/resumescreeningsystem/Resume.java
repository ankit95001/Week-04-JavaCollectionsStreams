package com.example.day01generics.resumescreeningsystem;

import java.util.ArrayList;
import java.util.List;

class Resume<T extends JobRole> {
    private List<T> resumes = new ArrayList<>();

    public void addResume(T resume) {
        resumes.add(resume);
    }

    public List<T> getResumes() {
        return new ArrayList<>(resumes);
    }
}
