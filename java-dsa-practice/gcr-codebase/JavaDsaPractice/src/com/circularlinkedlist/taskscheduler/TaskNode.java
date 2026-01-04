package com.circularlinkedlist.taskscheduler;

class TaskNode {
	//node attributes
    int taskId;
    String taskName;
    int priority;
    
    //node
    String dueDate;
    TaskNode next;

    //constructor 
    TaskNode(int taskId, String taskName, int priority, String dueDate) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.priority = priority;
        this.dueDate = dueDate;
        this.next = null;
    }
}
