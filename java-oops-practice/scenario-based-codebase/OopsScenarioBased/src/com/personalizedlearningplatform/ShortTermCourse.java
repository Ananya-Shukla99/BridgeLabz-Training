package com.personalizedlearningplatform;

public class ShortTermCourse extends Learner {

	public ShortTermCourse(String name, String email, int userId) {
        super(name, email, userId);
    }

    @Override
    public void generateCertificate() {
        System.out.println("Short Course Certificate issued to " + name + " (Duration: 4 Weeks)");
    }
}
