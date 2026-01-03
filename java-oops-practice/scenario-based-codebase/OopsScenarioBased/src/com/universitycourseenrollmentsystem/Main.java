package com.universitycourseenrollmentsystem;

public class Main {
	//main method 
    public static void main(String[] args) {

    	//creating object 
        Student s1 = new Undergraduate("Ananya");
        Course c1 = new Course("OOP");

        Enrollment e1 = new Enrollment(s1, c1);
        
        //calling display method 
        e1.show();

        Faculty f1 = new Faculty();
        f1.assignGrade("A");      
        f1.assignGrade(true);   

        //calling cgpa methods 
        double gpa = (8 + 6) / 2.0;
        s1.setGpa(gpa);

        System.out.println(s1.getName() + " GPA: " + s1.getGpa());
    }
}

