package com.personalfitnesstracker;

public class StrengthWorkout extends Workout {

	public static int burns=5;
	//constructor
	public StrengthWorkout( int duration) {
		super( "StrengthWorkout",duration);
	}
   	
	public void calculateCalories() {
		caloriesBurned=duration*burns;
	}
}
