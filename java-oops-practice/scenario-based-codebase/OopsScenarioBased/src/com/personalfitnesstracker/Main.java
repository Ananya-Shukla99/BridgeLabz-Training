package com.personalfitnesstracker;


public class Main {

	public static void main(String []args) {
		
		//creating objects
		UserProfile user = new UserProfile("Raman", 22, 70.5, 2000);
	
		StrengthWorkout strength = new StrengthWorkout(45);
		
		CardioWorkout cardio=new CardioWorkout (30);
		
		Workout strength2 = new StrengthWorkout(50);
		
        Workout cardio2 = new CardioWorkout(20);

        //starting session  & ending session
		strength.startWorkout();
        strength.calculateCalories();
        strength.stopWorkout();

        cardio.startWorkout();
        cardio.calculateCalories();
        cardio.stopWorkout();

        strength2.startWorkout();
        strength2.calculateCalories();
        strength2.stopWorkout();

        cardio2.startWorkout();
        cardio2.calculateCalories();
        cardio2.stopWorkout();

        user.addWorkout(cardio);
        user.addWorkout(cardio2);
        user.addWorkout(strength);
        user.addWorkout(strength2);

        System.out.println("\n----- FITNESS PROGRESS REPORT -----");
        System.out.println("Daily Calorie Goal: " + user.getGoal());
        System.out.println("Total Calories Burned: " + user.getTotalCaloriesBurned());

        int remaining = user.calculateProgress();
        if (remaining > 0) {
            System.out.println("Calories remaining to reach goal: " + remaining);
        } else {
            System.out.println("Goal achieved! Extra calories burned: " + (-remaining));
        }
	}
}
