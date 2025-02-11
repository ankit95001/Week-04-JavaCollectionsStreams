package com.example.day01generics.resumescreeningsystem;

class ProductManager extends JobRole {
    public ProductManager(String candidateName, int experienceYears) {
        super(candidateName, experienceYears);
    }

    @Override
    public String getRoleDetails() {
        return "Product Manager Resume - Name: " + getCandidateName() + ", Experience: " + getExperienceYears() + " years";
    }
}
