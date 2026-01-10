package com.skillforge;

import java.util.*;
public class Course {

	//attribute 
	private String title;
	private Instructor instructor;
	private double rating;
	private List<String> modules;
	private final List<String> internalReviews;
	
	//constructor 
	public Course(String title, Instructor instructor) {
        this.title = title;
        this.instructor = instructor;
        this.modules = new ArrayList<>();
        modules.add("Introduction");
        modules.add("Basics");
        this.internalReviews = new ArrayList<>();
    }
	
	//constructor
	public Course(String title, Instructor instructor, List<String> modules) {
        this.title = title;
        this.instructor = instructor;
        this.modules = modules;
        this.internalReviews = new ArrayList<>();
    }
	
	//getter
	public String getTitle() {
        return title;
    }

	public double getRating() {
        return rating;
    }

	public Instructor getInstructor() {
        return instructor;
    }
	public List<String> getInternalReviews() {
        return Collections.unmodifiableList(internalReviews);
    }
	
	//method
    protected void updateRating(double newRating) {
	    if (newRating >= 1 && newRating <= 5)
	        this.rating = newRating;
	}
    
	public boolean isPassed(Student s) {
        return s.getCompletedModules() >= modules.size();
    }

    public int getTotalModules() {
        return modules.size();
    }
}
