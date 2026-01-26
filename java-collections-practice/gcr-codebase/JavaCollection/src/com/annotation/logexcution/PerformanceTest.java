package com.annotation.logexcution;

public class PerformanceTest {

    @LogExecutionTime
    public void fastMethod() throws InterruptedException {
        Thread.sleep(100); 
    }

    @LogExecutionTime
    public void slowMethod() throws InterruptedException {
        Thread.sleep(300); 
    }

    public void normalMethod() throws InterruptedException {
        Thread.sleep(200); 
    }
}
