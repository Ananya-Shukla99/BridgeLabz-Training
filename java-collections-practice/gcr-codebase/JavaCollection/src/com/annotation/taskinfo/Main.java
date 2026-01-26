package com.annotation.taskinfo;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws Exception {
        TaskManager manager = new TaskManager();
        manager.completeTask();

        Method method = TaskManager.class.getMethod("completeTask");
        if (method.isAnnotationPresent(TaskInfo.class)) {
            TaskInfo info = method.getAnnotation(TaskInfo.class);
            System.out.println("Priority: " + info.priority());
            System.out.println("Assigned To: " + info.assignedTo());
        }
    }
}