package com.skillforge;

public class BeginnerCourse extends Course implements ICertifiable {

    public BeginnerCourse(String title, Instructor instructor) {
        super(title, instructor);
    }

    @Override
    public String generateCertificate(Student student) {
        return " Beginner Certificate\nStudent: " + student.name + "\nCourse: " + getTitle();
    }
}
