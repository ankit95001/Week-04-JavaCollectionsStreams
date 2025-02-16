package com.example.reflection.dependencyinjection;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class Main {
    private static final Map<Class<?>, Object> serviceInstances = new HashMap<>();

    public static void main(String[] args) {
        Client client = createInstance(Client.class);
        client.execute();
    }

    public static <T> T createInstance(Class<T> clazz) {
        try {
            T instance = clazz.getDeclaredConstructor().newInstance();

            for (Field field : clazz.getDeclaredFields()) {
                if (field.isAnnotationPresent(Inject.class)) {
                    Class<?> fieldType = field.getType();

                    Object dependency = serviceInstances.computeIfAbsent(fieldType, key -> {
                        try {
                            return fieldType.getDeclaredConstructor().newInstance();
                        } catch (Exception e) {
                            throw new RuntimeException("Failed to create dependency: " + key, e);
                        }
                    });

                    field.setAccessible(true);
                    field.set(instance, dependency);
                }
            }

            return instance;
        } catch (Exception e) {
            throw new RuntimeException("Dependency injection failed", e);
        }
    }
}

