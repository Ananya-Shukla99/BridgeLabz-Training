package com.circularlinkedlist.roundrobin;

public class Main {
    public static void main(String[] args) {

    	//node creation
        RoundRobinScheduler scheduler = new RoundRobinScheduler(3);

        //performing operation
        scheduler.addProcess(1, 10, 1);
        scheduler.addProcess(2, 5, 2);
        scheduler.addProcess(3, 8, 1);

        scheduler.schedule();
    }
}
