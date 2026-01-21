package com.generics.resumebubby;

import java.util.List;

public class Screening {

    public static <T extends JobRole> void screenResume(Resume<T> resume) {
        System.out.println("Screening resume...");
        resume.processResume();
    }

    
    public static void screenMultipleResumes(List<? extends JobRole> candidates) {
        System.out.println("AI Screening Pipeline Started...");
        for (JobRole role : candidates) {
            role.evaluateSkills();
        }
    }
}
