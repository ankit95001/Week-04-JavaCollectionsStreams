package com.example.day01generics.mealplangenerator;

public class VegetarianMeal implements MealPlan{
    @Override
    public String getMealDetails() {
        return "Vegetarian Meal: Mixed Vegetable Curry, Rice, and Salad";
    }
}
