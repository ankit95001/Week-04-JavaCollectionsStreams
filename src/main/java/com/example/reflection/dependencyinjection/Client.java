package com.example.reflection.dependencyinjection;

public class Client {
    @Inject
    private Service service;

    public void execute() {
        service.perform();
    }
    public Service getService() {
        return service;
    }
}

