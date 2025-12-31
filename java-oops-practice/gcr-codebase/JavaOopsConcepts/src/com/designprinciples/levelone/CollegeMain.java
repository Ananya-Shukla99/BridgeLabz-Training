package com.designprinciples.levelone;

public class CollegeMain {

	public static void main(String[] args) {

        CollegeStudent s1 = new CollegeStudent("Aman");
        CollegeStudent s2 = new CollegeStudent("Ram");

        Professor p1 = new Professor("Dr. Sudha");

        CollegeCourse c1 = new CollegeCourse("Object-Oriented Programming");

        s1.enrollCourse(c1);
        s2.enrollCourse(c1);

        p1.assignProfessor(c1);

        c1.showCourseDetails();
    }
}
