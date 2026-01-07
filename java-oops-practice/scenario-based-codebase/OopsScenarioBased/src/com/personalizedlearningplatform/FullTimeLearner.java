package com.personalizedlearningplatform;

class FullTimeLearner extends Learner {

    public FullTimeLearner(String name, String email, int userId) {
        super(name, email, userId);
    }

    @Override
    public void generateCertificate() {
        System.out.println("Full-Time Program Certificate issued to " + name +" Duration: 1 Year");
    }
}