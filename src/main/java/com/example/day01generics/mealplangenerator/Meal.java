package com.example.day01generics.mealplangenerator;

import java.util.ArrayList;
import java.util.List;

public class Meal<T extends MealPlan>{
    List<T> list = new ArrayList<>();

    public void addMeal(T meal){
        list.add(meal);
    }

    public List<T> getMeals(){
        return list;
    }
}
