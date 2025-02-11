package com.example.day01generics.mealplangenerator;

public class VeganMeal implements MealPlan{
    @Override
    public String getMealDetails() {
        return "Vegan Meal: Tofu Stir Fry, Brown Rice, and Fruit Salad";
    }
}
