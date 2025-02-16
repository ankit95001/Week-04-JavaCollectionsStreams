package com.example.reflection.accessprivatefield;

import java.lang.reflect.Field;

public class Person {
    private int age;

    public Person(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}

