package com.virtualpetcareapp;

import java.util.*;
public abstract class Pet implements IInteractable   {

	//attribute
	public String name;
	public String type;
	public int age;
	private  int energy;
	private String mood;
	private int hunger;
	
	//constructor
	public Pet(String name, String type, int age) {
		this.name = name;
		this.type = type;
		this.age = age;
		
		this.energy = (int) (Math.random() * 40 + 60); 
        this.hunger = (int) (Math.random() * 40);      
        updateMood();
	}
	//abstract method 
	abstract void makeSound() ;

	@Override
    public void feed() {
        hunger -= 20;
        energy += 10;
        normalizeStats();
        updateMood();
        System.out.println(name + " has been fed.");
    }

    @Override
    public void play() {
        energy -= 15;
        hunger += 20;
        normalizeStats();
        updateMood();
        System.out.println(name + " is playing.");
    }

    @Override
    public void sleep() {
        energy += 30;
        hunger += 10;
        normalizeStats();
        updateMood();
        System.out.println(name + " is sleeping.");
    }

    // Helper methods
    private void normalizeStats() {
        energy = Math.max(0, Math.min(100, energy));
        hunger = Math.max(0, Math.min(100, hunger));
    }

    private void updateMood() {
        if (energy > 50 && hunger < 50) {
            mood = "Good";
        } else {
            mood = "Bad";
        }
    }

    // Getters (encapsulation)
    public int getEnergy() {
        return energy;
    }

    public int getHunger() {
        return hunger;
    }

    public String getMood() {
        return mood;
    }

    public void showStatus() {
        System.out.println("Energy: " + energy);
        System.out.println("Hunger: " + hunger);
        System.out.println("Mood: " + mood);
    }
	
}

