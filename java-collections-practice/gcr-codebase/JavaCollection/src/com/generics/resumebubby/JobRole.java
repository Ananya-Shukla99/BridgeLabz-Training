package com.generics.resumebubby;

public abstract class JobRole {

	protected String candidateName;

    public JobRole(String candidateName) {
        this.candidateName = candidateName;
    }

    public abstract void evaluateSkills();

    public String getCandidateName() {
        return candidateName;
    }
}
