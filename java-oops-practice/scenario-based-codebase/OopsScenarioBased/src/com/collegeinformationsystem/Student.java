package com.collegeinformationsystem;

public class Student extends Person implements ICourseActions{

	// Private attributes 
	private int []grades;
	private Course course;
	
	//constructor
	Student(int id, String name, String email, int [] grades){
		super(id, name, email);
		this.grades=grades;
	}
	

	public void printDetails() {
		System.out.println("Student name : "+name);
		System.out.println("Student id : "+id);
		System.out.println("Student email : "+email);
		System.out.println("Student course "+ course.getCourseName());
		System.out.println("Student grade "+ calculateGrade());
		
	}
	
	//method calculate
    double calculateGrade() {
    	double sum=0.0;
    	for(int i:grades) {
    		sum+=i;
    	}
    	return (sum/grades.length)/10;
    }
	//method overriding
	
		@Override
		public void enrollCourse(Course course) {
			this.course=course;
			course.addStudent(this);
			System.out.println("Student enrolled "+ course);
		}
		
		
		public void dropCourse(Course course) {
			 
			course.removeStudent(this);
			System.out.println("Student removed form course "+ course);
			this.course=null;
				
		}
}
