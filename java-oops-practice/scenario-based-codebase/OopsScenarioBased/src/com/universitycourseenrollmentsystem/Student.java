package com.universitycourseenrollmentsystem;

class Student {
	
	//Private field 
    private double gpa;       
    private String name;

    //constructor 
    Student(String name) {
        this.name = name;
    }

    //constructor 
    Student(String name, String elective) {
        this.name = name;
        System.out.println("Elective chosen: " + elective);
    }

    //public setter
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    //public getter
    public double getGpa() {
        return gpa;
    }
    
    //public getter 
    public String getName() {
        return name;
    }
}

