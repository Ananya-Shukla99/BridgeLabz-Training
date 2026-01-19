package com.mealplan;

public class Main {

	public static void main(String[] args) {

		Meal<Vegetarian> vegMeal = MealPlanGenerator.generateMealPlan(new Vegetarian());

		Meal<Vegan> veganMeal = MealPlanGenerator.generateMealPlan(new Vegan());

		Meal<Keto> ketoMeal = MealPlanGenerator.generateMealPlan(new Keto());

		Meal<HighProtein> proteinMeal = MealPlanGenerator.generateMealPlan(new HighProtein());

		vegMeal.showMeal();
		veganMeal.showMeal();
		ketoMeal.showMeal();
		proteinMeal.showMeal();
	}
}
