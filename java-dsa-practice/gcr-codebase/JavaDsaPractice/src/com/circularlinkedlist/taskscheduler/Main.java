package com.circularlinkedlist.taskscheduler;

public class Main {
	//main method 
    public static void main(String[] args) {

    	//node creation
        TaskScheduler scheduler = new TaskScheduler();

        //performing operation
        scheduler.addAtEnd(1, "Design Module", 1, "10-02-2026");
        scheduler.addAtEnd(2, "Write Code", 2, "12-02-2026");
        scheduler.addAtBeginning(3, "Testing", 1, "15-02-2026");

        System.out.println("All Tasks:");
        scheduler.displayAll();

        System.out.println("\nCurrent Task Cycle:");
        scheduler.viewNextTask();
        scheduler.viewNextTask();
        scheduler.viewNextTask();

        System.out.println("\nHigh Priority Tasks:");
        scheduler.searchByPriority(1);

        scheduler.removeById(2);

        System.out.println("\nAfter Removal:");
        scheduler.displayAll();
    }
}
