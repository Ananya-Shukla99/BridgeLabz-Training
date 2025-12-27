package com.constructor.levelone;

public class StudentMain {

	public static void main(String[] args) {

        PostgraduateStudent p = new PostgraduateStudent(101, "Ananya", 9.5, "CSE-AIML");

        p.displayStudentInfo();

        // Modify CGPA using public setter
        p.setCgpa(9.8);

        System.out.println("Updated CGPA: " + p.getCgpa());
    }
}
