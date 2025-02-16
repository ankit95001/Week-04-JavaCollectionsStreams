package com.example.reflection.createcustomobjectmapper;

import java.lang.reflect.Field;
import java.util.Map;

public class Main{
    public static <T> T toObject(Class<T> cls, Map<String, Object> properties){
        try{
            T instance = cls.getDeclaredConstructor().newInstance();

            for(Map.Entry<String,Object> entry:properties.entrySet()){
                String key = entry.getKey();
                Object value = entry.getValue();

                Field field = cls.getDeclaredField(key);
                field.setAccessible(true);
                field.set(instance,value);
            }
            return instance;

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }
    public static void main(String[] args) {
        Map<String, Object> userData = Map.of(
                "name", "Ankit kumar",
                "age", 22,
                "email", "ankit.kumar@gmail.com"
        );

        User user = toObject(User.class, userData);
        System.out.println(user.getDetails());
    }
}