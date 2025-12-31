package com.designprinciples.levelone;

public class CollegeStudent {

	private String name;

    public CollegeStudent(String name) {
        this.name = name;
    }

    // Communication with Course
    public void enrollCourse(CollegeCourse course) {
        course.addStudent(this);
        System.out.println("Student " + name + " enrolled in " + course.getCourseName());
    }

    public String getName() {
        return name;
    }
}
