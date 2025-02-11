package com.example.day01generics.resumescreeningsystem;

import java.util.List;

public class Main {
    public static void screenResumes(List<? extends JobRole> resumes) {
        for (JobRole resume : resumes) {
            System.out.println("Screening: " + resume.getRoleDetails());
        }
    }
    public static void main(String[] args) {
        Resume<SoftwareEngineer> softwareEngineerResumes = new Resume<>();
        softwareEngineerResumes.addResume(new SoftwareEngineer("Ankit kumar", 5));

        Resume<DataScientist> dataScientistResumes = new Resume<>();
        dataScientistResumes.addResume(new DataScientist("Aakrati Barsaiyan", 3));

        Resume<ProductManager> productManagerResumes = new Resume<>();
        productManagerResumes.addResume(new ProductManager("Anand Soni", 7));

        // Screening resumes dynamically
        System.out.println("Screening Software Engineer Resumes:");
        screenResumes(softwareEngineerResumes.getResumes());

        System.out.println("\nScreening Data Scientist Resumes:");
        screenResumes(dataScientistResumes.getResumes());

        System.out.println("\nScreening Product Manager Resumes:");
        screenResumes(productManagerResumes.getResumes());
    }
}
