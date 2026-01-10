package com.skillforge;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Instructor inst = new Instructor("Aman", "amann@skillforge.com");
        Student stu = new Student("Shan", "silly@gmail.com");

        List<String> modules = Arrays.asList("Java", "OOP", "Spring");

        AdvancedCourse course = new AdvancedCourse("Java Mastery", inst, modules);

        //student progresses
        stu.completeModule();
        stu.completeModule();
        stu.completeModule();

        if (course.isPassed(stu)) {
            System.out.println(course.generateCertificate(stu));
        }
    }
}
