package com.generics.mealplan;

public class Vegetarian implements MealPlan {

    @Override
    public void displayPlan() {
        System.out.println("Vegetarian Meal: Veg curry, rice, salad.");
    }
}
