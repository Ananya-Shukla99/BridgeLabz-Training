package com.personalfitnesstracker;

public abstract class Workout implements ITrackable {

	//attribute
	protected String type;
	protected int duration;
	protected int caloriesBurned;
	
	//constructor
	public Workout(String type, int duration) {
		this.type = type;
		this.duration = duration;
	}
	
	@Override
	public void startWorkout() {
		System.out.println(type +"workout started");
	}
	
	@Override
	public void stopWorkout() {
		System.out.println(type +"workout ended");
	}
	
	abstract void calculateCalories();
	
	public int getCaloriesBurned() {
		return caloriesBurned;
	}
}

