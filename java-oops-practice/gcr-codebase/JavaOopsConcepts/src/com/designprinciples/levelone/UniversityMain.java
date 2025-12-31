package com.designprinciples.levelone;

public class UniversityMain 
{
    public static void main(String[] args) 
    {

        Faculty f1 = new Faculty("Dr. Anjini");
        Faculty f2 = new Faculty("Dr. Hemant");

        University uni = new University("Tech University");

        uni.addDepartment("Computer Science");
        uni.addDepartment("Mechanical Engineering");

        uni.addFaculty(f1);
        uni.addFaculty(f2);

        // Delete university
        uni.closeUniversity();

        // Faculty still exists independently
        System.out.println("\nFaculty still exists after university deletion:");
        System.out.println(f1.getName());
        System.out.println(f2.getName());
    }
}