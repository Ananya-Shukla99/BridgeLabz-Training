package com.testing;

public class PerformanceUtils {

    public static String longRunningTask() throws InterruptedException {
        Thread.sleep(3000); 
        return "Done";
    }
}
