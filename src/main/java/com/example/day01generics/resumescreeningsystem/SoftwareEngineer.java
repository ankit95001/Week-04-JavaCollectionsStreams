package com.example.day01generics.resumescreeningsystem;

class SoftwareEngineer extends JobRole {
    public SoftwareEngineer(String candidateName, int experienceYears) {
        super(candidateName, experienceYears);
    }

    @Override
    public String getRoleDetails() {
        return "Software Engineer Resume - Name: " + getCandidateName() + ", Experience: " + getExperienceYears() + " years";
    }
}
