package com.generics.coursemanager;

import java.util.ArrayList;
import java.util.List;

public class Department {

    private List<Course<? extends CourseType>> courses = new ArrayList<>();

    public void addCourse(Course<? extends CourseType> course) {
        courses.add(course);
    }

    public void listCourses() {
        for (Course<? extends CourseType> course : courses) {
            course.evaluateCourse();
        }
    }
}
