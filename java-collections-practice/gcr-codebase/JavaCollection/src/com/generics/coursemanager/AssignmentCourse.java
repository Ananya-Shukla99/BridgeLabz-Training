package com.generics.coursemanager;

public class AssignmentCourse extends CourseType {

    private int assignmentCount;

    public AssignmentCourse(String courseCode, String courseName, int assignmentCount) {
        super(courseCode, courseName);
        this.assignmentCount = assignmentCount;
    }

    @Override
    public void evaluate() {
        System.out.println(courseName + " evaluated by " + assignmentCount + " assignments.");
    }
}