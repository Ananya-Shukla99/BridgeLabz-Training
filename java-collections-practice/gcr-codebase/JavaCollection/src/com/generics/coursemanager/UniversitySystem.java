package com.generics.coursemanager;

public class UniversitySystem {

	public static void main(String[] args) {

		Course<ExamCourse> examCourse = new Course<>(new ExamCourse("CS101", "Data Structures", 70));

		Course<AssignmentCourse> assignmentCourse = new Course<>(new AssignmentCourse("CS102", "OOP", 5));

		Course<ResearchCourse> researchCourse = new Course<>(
				new ResearchCourse("CS103", "AI Research", "Machine Learning"));

		Department computerScience = new Department();

		computerScience.addCourse(examCourse);
		computerScience.addCourse(assignmentCourse);
		computerScience.addCourse(researchCourse);

		computerScience.listCourses();
	}
}
