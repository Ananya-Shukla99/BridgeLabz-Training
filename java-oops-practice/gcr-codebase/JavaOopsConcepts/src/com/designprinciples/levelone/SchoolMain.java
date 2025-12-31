package com.designprinciples.levelone;

public class SchoolMain {

	public static void main(String[] args) {

        // Create School
        School school = new School("Greenwood High");

        // Create Students
        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");

        // Aggregation: add students to school
        school.addStudent(s1);
        school.addStudent(s2);

        // Create Courses
        Course math = new Course("Math");
        Course physics = new Course("Physics");

        s1.enrollCourse(math);
        s1.enrollCourse(physics);

        s2.enrollCourse(physics);

        // Display
        school.showStudents();
        System.out.println();
        s1.showCourses();
        System.out.println();
        physics.showStudents();
    }

}
