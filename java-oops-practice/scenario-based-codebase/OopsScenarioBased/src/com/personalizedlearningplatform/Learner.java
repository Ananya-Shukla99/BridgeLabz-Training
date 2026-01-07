package com.personalizedlearningplatform;

abstract class Learner extends User implements ICertifiable {

    public Learner(String name, String email, int userId) {
        super(name, email, userId);
    }
}
