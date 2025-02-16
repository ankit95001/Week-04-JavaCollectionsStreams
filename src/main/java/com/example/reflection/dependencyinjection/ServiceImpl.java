package com.example.reflection.dependencyinjection;

public class ServiceImpl implements Service {
    @Override
    public void perform() {
        System.out.println("Service is performing an action.");
    }
}

