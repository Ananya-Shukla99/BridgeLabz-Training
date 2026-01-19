package com.mealplan;

public class MealPlanGenerator {

	public static <T extends MealPlan> Meal<T> generateMealPlan(T plan) {
        System.out.println("Validating meal plan...");
        return new Meal<>(plan);
    }
}
