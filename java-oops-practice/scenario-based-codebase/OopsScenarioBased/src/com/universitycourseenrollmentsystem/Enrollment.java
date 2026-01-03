package com.universitycourseenrollmentsystem;

class Enrollment {
	
    private Student student;
    private Course course;

    Enrollment(Student student, Course course) {
        this.student = student;
        this.course = course;
    }

    public Student getStudent() {
        return student;
    }

    public Course getCourse() {
        return course;
    }
    public void show() {
    	System.out.println("Student " + student +"course "+course);
    }
}
