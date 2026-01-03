package com.universitycourseenrollmentsystem;

class Faculty implements Graded {

    //method to assign grade
	public void assignGrade(String grade) {
        System.out.println("Grade assigned: " + grade);
    }

    //method to check pass /fail
	public void assignGrade(boolean pass) {
        System.out.println(pass ? "Pass" : "Fail");
    }
}
