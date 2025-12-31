package com.designprinciples.levelone;

public class Professor {
    private String name;

    public Professor(String name) {
        this.name = name;
    }

    // Communication with Course
    public void assignProfessor(CollegeCourse course) {
        course.setProfessor(this);
        System.out.println("Professor " + name + " assigned to " + course.getCourseName());
    }

    public String getName() {
        return name;
    }
}
