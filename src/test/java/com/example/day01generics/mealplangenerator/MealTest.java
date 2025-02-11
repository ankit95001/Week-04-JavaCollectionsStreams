package com.example.day01generics.mealplangenerator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

class MealTest {

    @Test
    void testAddMeal() {
        Meal<VegetarianMeal> vegetarianMealPlan = new Meal<>();
        VegetarianMeal vegMeal = new VegetarianMeal();

        vegetarianMealPlan.addMeal(vegMeal);

        List<VegetarianMeal> meals = vegetarianMealPlan.getMeals();
        assertEquals(1, meals.size());
        assertEquals("Vegetarian Meal: Mixed Vegetable Curry, Rice, and Salad", meals.get(0).getMealDetails());
    }

    @Test
    void testMultipleMeals() {
        Meal<VeganMeal> veganMealPlan = new Meal<>();
        VeganMeal veganMeal1 = new VeganMeal();
        VeganMeal veganMeal2 = new VeganMeal();

        veganMealPlan.addMeal(veganMeal1);
        veganMealPlan.addMeal(veganMeal2);

        List<VeganMeal> meals = veganMealPlan.getMeals();
        assertEquals(2, meals.size());
        assertEquals(veganMeal1.getMealDetails(), meals.get(0).getMealDetails());
        assertEquals(veganMeal2.getMealDetails(), meals.get(1).getMealDetails());
    }

    @Test
    void testMealDetails() {
        KetoMeal ketoMeal = new KetoMeal();
        String expectedOutput = "Keto Meal: Grilled Chicken, Avocado Salad, and Cheese";

        assertEquals(expectedOutput, ketoMeal.getMealDetails());
    }
}
