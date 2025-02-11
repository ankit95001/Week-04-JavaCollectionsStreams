package com.example.day01generics.mealplangenerator;

public class Main {
    public static <T extends MealPlan> void generateMealPlan(T meal) {
        System.out.println("Generated Meal Plan: " + meal.getMealDetails());
    }
    public static void main(String[] args) {
        Meal<VegetarianMeal> vegetarianMealPlan = new Meal<>();
        vegetarianMealPlan.addMeal(new VegetarianMeal());

        Meal<VeganMeal> veganMealPlan = new Meal<>();
        veganMealPlan.addMeal(new VeganMeal());

        Meal<KetoMeal> ketoMealPlan = new Meal<>();
        ketoMealPlan.addMeal(new KetoMeal());

        Meal<HighProteinMeal> highProteinMealPlan = new Meal<>();
        highProteinMealPlan.addMeal(new HighProteinMeal());

        // Generating personalized meal plans
        System.out.println("Vegetarian Meal Plan:");
        vegetarianMealPlan.getMeals().forEach(Main::generateMealPlan);

        System.out.println("\nVegan Meal Plan:");
        veganMealPlan.getMeals().forEach(Main::generateMealPlan);

        System.out.println("\nKeto Meal Plan:");
        ketoMealPlan.getMeals().forEach(Main::generateMealPlan);

        System.out.println("\nHigh-Protein Meal Plan:");
        highProteinMealPlan.getMeals().forEach(Main::generateMealPlan);
    }
}
