package com.example.day01generics.resumescreeningsystem;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

class ResumeTest {

    @Test
    void testAddResume() {
        Resume<SoftwareEngineer> softwareEngineerResumes = new Resume<>();
        SoftwareEngineer candidate = new SoftwareEngineer("Ankit Kumar", 5);

        softwareEngineerResumes.addResume(candidate);

        List<SoftwareEngineer> resumes = softwareEngineerResumes.getResumes();
        assertEquals(1, resumes.size());
        assertEquals("Software Engineer Resume - Name: Ankit Kumar, Experience: 5 years", resumes.get(0).getRoleDetails());
    }

    @Test
    void testMultipleResumes() {
        Resume<DataScientist> dataScientistResumes = new Resume<>();
        DataScientist candidate1 = new DataScientist("Aakrati Barsaiyan", 3);
        DataScientist candidate2 = new DataScientist("Rahul Sharma", 4);

        dataScientistResumes.addResume(candidate1);
        dataScientistResumes.addResume(candidate2);

        List<DataScientist> resumes = dataScientistResumes.getResumes();
        assertEquals(2, resumes.size());
        assertEquals(candidate1.getRoleDetails(), resumes.get(0).getRoleDetails());
        assertEquals(candidate2.getRoleDetails(), resumes.get(1).getRoleDetails());
    }

    @Test
    void testResumeDetails() {
        ProductManager candidate = new ProductManager("Anand Soni", 7);
        String expectedOutput = "Product Manager Resume - Name: Anand Soni, Experience: 7 years";

        assertEquals(expectedOutput, candidate.getRoleDetails());
    }
}
