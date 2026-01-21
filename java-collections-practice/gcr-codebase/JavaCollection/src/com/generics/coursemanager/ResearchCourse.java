package com.generics.coursemanager;

public class ResearchCourse extends CourseType {

    private String researchTopic;

    public ResearchCourse(String courseCode, String courseName, String researchTopic) {
        super(courseCode, courseName);
        this.researchTopic = researchTopic;
    }

    @Override
    public void evaluate() {
        System.out.println(courseName + " evaluated by research on " + researchTopic + ".");
    }
}
