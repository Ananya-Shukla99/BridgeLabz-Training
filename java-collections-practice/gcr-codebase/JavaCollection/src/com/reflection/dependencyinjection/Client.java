package com.reflection.dependencyinjection;

class Client {

    @Inject
    private Service service;

    public void doWork() {
        service.serve();
    }
}
