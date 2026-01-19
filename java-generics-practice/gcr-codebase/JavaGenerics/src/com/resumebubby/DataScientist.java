package com.resumebubby;

public class DataScientist extends JobRole {

    public DataScientist(String candidateName) {
        super(candidateName);
    }

    @Override
    public void evaluateSkills() {
        System.out.println(candidateName + ": Evaluating data analysis and ML skills.");
    }
    
}
