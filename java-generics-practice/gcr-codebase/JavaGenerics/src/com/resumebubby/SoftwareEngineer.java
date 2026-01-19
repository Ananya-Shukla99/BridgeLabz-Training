package com.resumebubby;

public class SoftwareEngineer extends JobRole {

    public SoftwareEngineer(String candidateName) {
        super(candidateName);
    }

    @Override
    public void evaluateSkills() {
        System.out.println(candidateName + ": Evaluating coding and system design skills.");
    }
}