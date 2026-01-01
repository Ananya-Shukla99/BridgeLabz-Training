package com.Inheritance.leveltwo;

public class CourseMain {

	 public static void main(String[] args) {
	        PaidOnlineCourse course = new PaidOnlineCourse("Object-Oriented Programming",40,"Udemy",true, 200.0, 25.0);
	        PaidOnlineCourse course1 = new PaidOnlineCourse("JAVA",4,"Amazon",true, 200.0, 50.0);
	        PaidOnlineCourse course2 = new PaidOnlineCourse("C++",3,"Udemy",true, 200.0, 80.0);

	        course.displayCourseInfo();
	        course1.displayCourseInfo();
	        course2.displayCourseInfo();
	    }
}










