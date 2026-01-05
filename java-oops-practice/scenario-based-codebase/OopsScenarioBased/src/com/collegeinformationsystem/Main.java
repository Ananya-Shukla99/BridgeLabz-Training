package com.collegeinformationsystem;

public class Main {

	//main method
	public static void main(String[] args) {

        Faculty faculty = new Faculty(101, "Dr. Rao", "rao@college.edu", "Computer Science");

        Course java = new Course("Java Programming", faculty);

        int[] grades = {85, 90, 88};
        Student student = new Student(1, "Amit", "amit@college.edu", grades);

        student.enrollCourse(java);

        Person p1 = student;
        Person p2 = faculty;

        p1.printDetails();
        System.out.println();
        p2.printDetails();
    }
}
