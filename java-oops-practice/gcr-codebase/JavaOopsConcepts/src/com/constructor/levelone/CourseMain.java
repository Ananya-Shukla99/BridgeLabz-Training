package com.constructor.levelone;

public class CourseMain
{
    public static void main(String []args) {
    	
    	//creating the objects
    	Course c1=new Course("Java", 6, 75000);
    	Course c2=new Course("c", 6, 50000);
    	Course c3=new Course("c++", 6, 95000);
    	Course c4=new Course("python", 6, 11000);
    	Course c5=new Course("sql", 6, 55000);
    	
    	//calling display function
    	c1.displayCourseDetails();
    	c2.displayCourseDetails();
    	
    	//updating institute name
    	Course.updateInstituteName("TIT Institute ");
    	
    	//calling display function after updates
    	c3.displayCourseDetails();
    	c4.displayCourseDetails();
    	c5.displayCourseDetails();
    	
    }
}
