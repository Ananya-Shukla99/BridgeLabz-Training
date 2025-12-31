package com.designprinciples.levelone;

public class UniversityDepartment {

    private String name;

    public UniversityDepartment(String name) {
        this.name = name;
        System.out.println("Department created: " + name);
    }

    public String getName() {
        return name;
    }

    public void close() {
        System.out.println("Department deleted: " + name);
    }
}
