package com.personalfitnesstracker;

public class CardioWorkout extends Workout {
	
	public static int  burns=10;

	//constructor
	public CardioWorkout( int duration) {
		super( "CardioWorkout",duration);
	}
   	
	@Override
	public void calculateCalories() {
		caloriesBurned = duration* burns;
	}

}
