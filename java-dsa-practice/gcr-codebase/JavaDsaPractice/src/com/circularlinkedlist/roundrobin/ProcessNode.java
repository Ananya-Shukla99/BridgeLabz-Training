package com.circularlinkedlist.roundrobin;

class ProcessNode {
	//attribute
    int pid;
    int burstTime;
    int remainingTime;
    int priority;
    ProcessNode next;

    //constructor
    ProcessNode(int pid, int burstTime, int priority) {
        this.pid = pid;
        this.burstTime = burstTime;
        this.remainingTime = burstTime;
        this.priority = priority;
        this.next = null;
    }
}

