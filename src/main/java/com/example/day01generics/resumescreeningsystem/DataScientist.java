package com.example.day01generics.resumescreeningsystem;

class DataScientist extends JobRole {
    public DataScientist(String candidateName, int experienceYears) {
        super(candidateName, experienceYears);
    }

    @Override
    public String getRoleDetails() {
        return "Data Scientist Resume - Name: " + getCandidateName() + ", Experience: " + getExperienceYears() + " years";
    }
}
