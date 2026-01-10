package com.skillforge;

public class Student extends User {

	private int completedModules;

    public Student(String name, String email) {
        super(name, email);
        this.completedModules = 0;
    }

    public void completeModule() {
        completedModules++;
    }

    public int getCompletedModules() {
        return completedModules;
    }
}
