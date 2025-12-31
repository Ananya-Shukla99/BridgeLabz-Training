package com.designprinciples.levelone;

import java.util.ArrayList;
import java.util.List;

public class University {
    private String name;
    private List<UniversityDepartment> departments; 
    private List<Faculty> facultyMembers; 

    public University(String name) {
        this.name = name;
        departments = new ArrayList<>();
        facultyMembers = new ArrayList<>();
        System.out.println("University created: " + name);
    }


    public void addDepartment(String deptName) {
        departments.add(new UniversityDepartment(deptName));
    }


    public void addFaculty(Faculty faculty) {
        facultyMembers.add(faculty);
    }

    public void closeUniversity() {
        System.out.println("\nClosing University: " + name);

        // Destroy Departments (Composition)
        for (UniversityDepartment d : departments) {
            d.close();
        }
        
        departments.clear();

        System.out.println("University deleted: " + name);
    }
}