package com.mealplan;

public class Vegan implements MealPlan {

    @Override
    public void displayPlan() {
        System.out.println("Vegan Meal: Lentils, quinoa, vegetables.");
    }
}
