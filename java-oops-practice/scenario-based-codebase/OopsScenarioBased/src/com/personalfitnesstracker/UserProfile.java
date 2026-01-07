package com.personalfitnesstracker;

import java.util.*;

public class UserProfile {

    //attribute
	public String  name;
	protected int age;
	private double weight;
	private int goal;
	
	private ArrayList<Workout> workouts = new ArrayList<>();
	
	// Constructor with default goal
    public UserProfile(String name, int age, double weight) {
        this(name, age, weight, 2000);
    }

    // Constructor with custom goal
    public UserProfile(String name, int age, double weight, int goal) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.goal= goal;
    }
	
	//get weight
	public double getWeight() {
		return weight;
	}
	
	public int getGoal() {
	    return goal;
	}
	
	//add work out 
	public void addWorkout(Workout w) {
		workouts.add(w);
	}
	
	//track progress
	public int getTotalCaloriesBurned() {
        int total = 0;
        for (Workout w : workouts) {
            total += w.getCaloriesBurned();
        }
        return total;
    }

    public int calculateProgress() {
        return goal - getTotalCaloriesBurned();
    }
}
