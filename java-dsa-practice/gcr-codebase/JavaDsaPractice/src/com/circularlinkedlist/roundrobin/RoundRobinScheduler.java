package com.circularlinkedlist.roundrobin;

class RoundRobinScheduler {
	//private nodes 
    private ProcessNode head;
    private ProcessNode tail;
    private int timeQuantum;
    private int time = 0;
    private int totalProcesses = 0;
    private int totalWaitingTime = 0;
    private int totalTurnAroundTime = 0;

    RoundRobinScheduler(int timeQuantum) {
        this.timeQuantum = timeQuantum;
    }

    //add process at end
    void addProcess(int pid, int burstTime, int priority) {
        ProcessNode newNode = new ProcessNode(pid, burstTime, priority);

        if (head == null) {
            head = tail = newNode;
            newNode.next = head;
        } else {
            tail.next = newNode;
            newNode.next = head;
            tail = newNode;
        }
        totalProcesses++;
    }

    //remove process by ID
    void removeProcess(int pid) {
        if (head == null) return;

        ProcessNode curr = head;
        ProcessNode prev = tail;

        do {
            if (curr.pid == pid) {
                if (curr == head && curr == tail) {
                    head = tail = null;
                } else {
                    prev.next = curr.next;
                    if (curr == head) head = curr.next;
                    if (curr == tail) tail = prev;
                }
                return;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != head);
    }

    //simulate Round Robin Scheduling
    void schedule() {
        if (head == null) return;

        ProcessNode curr = head;

        while (head != null) {
            displayProcesses();

            if (curr.remainingTime > timeQuantum) {
                curr.remainingTime -= timeQuantum;
                time += timeQuantum;
            } else {
                time += curr.remainingTime;
                totalTurnAroundTime += time;
                totalWaitingTime += time - curr.burstTime;
                int pid = curr.pid;
                curr = curr.next;
                removeProcess(pid);
                continue;
            }
            curr = curr.next;
        }

        displayAverages();
    }

    //display process list
    void displayProcesses() {
        if (head == null) return;

        ProcessNode temp = head;
        System.out.print("Queue: ");
        do {
            System.out.print("P" + temp.pid + "(" + temp.remainingTime + ") ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }

    //display average times
    void displayAverages() {
        System.out.println("\nAverage Waiting Time: " +
                (double) totalWaitingTime / totalProcesses);
        System.out.println("Average Turnaround Time: " +
                (double) totalTurnAroundTime / totalProcesses);
    }
}
