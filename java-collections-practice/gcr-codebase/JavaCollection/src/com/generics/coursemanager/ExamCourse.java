package com.generics.coursemanager;

public class ExamCourse extends CourseType{

	private double examWeight;

    public ExamCourse(String courseCode, String courseName, double examWeight) {
        super(courseCode, courseName);
        this.examWeight = examWeight;
    }

    @Override
    public void evaluate() {
        System.out.println(courseName + " evaluated by final exam (" + examWeight + "%).");
    }
}
