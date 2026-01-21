package com.generics.coursemanager;

public abstract class CourseType {

	protected String courseCode;
    protected String courseName;

    public CourseType(String courseCode, String courseName) {
        this.courseCode = courseCode;
        this.courseName = courseName;
    }

    public abstract void evaluate();

    public String getCourseName() {
        return courseName;
    }
}
