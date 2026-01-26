package com.annotation.importantmethod;

public class ProjectTasks {

    @ImportantMethod
    public void deployApp() {
        System.out.println("Deploying application...");
    }

    @ImportantMethod(level = "MEDIUM")
    public void runTests() {
        System.out.println("Running tests...");
    }

    public void cleanup() {
        System.out.println("Cleaning up...");
    }
}