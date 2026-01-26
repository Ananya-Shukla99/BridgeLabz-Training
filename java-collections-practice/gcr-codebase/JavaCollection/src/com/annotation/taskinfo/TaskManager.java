package com.annotation.taskinfo;

public class TaskManager {

    @TaskInfo(priority = "High", assignedTo = "Raman")
    public void completeTask() {
        System.out.println("Task is being completed.");
    }
}