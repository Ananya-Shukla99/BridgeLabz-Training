package com.skillforge;

import java.util.*;

public class AdvancedCourse extends Course implements ICertifiable {

    public AdvancedCourse(String title, Instructor instructor, List<String> modules) {
        super(title, instructor, modules);
    }

    @Override
    public String generateCertificate(Student student) {
        return "Advanced Certificate\nStudent: " + student.name + "\nCourse: " + getTitle() +"\nAchievement: High Distinction";
    }
}
