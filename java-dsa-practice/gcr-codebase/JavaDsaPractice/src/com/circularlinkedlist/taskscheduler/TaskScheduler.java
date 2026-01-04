package com.circularlinkedlist.taskscheduler;

class TaskScheduler {
	
    private TaskNode head;
    private TaskNode current;

    //add at beginning
    void addAtBeginning(int id, String name, int priority, String date) {
        TaskNode newNode = new TaskNode(id, name, priority, date);

        if (head == null) {
            head = newNode;
            newNode.next = head;
            current = head;
            return;
        }

        TaskNode temp = head;
        while (temp.next != head)
            temp = temp.next;

        newNode.next = head;
        temp.next = newNode;
        head = newNode;
    }

    //add at end
    void addAtEnd(int id, String name, int priority, String date) {
        TaskNode newNode = new TaskNode(id, name, priority, date);

        if (head == null) {
            head = newNode;
            newNode.next = head;
            current = head;
            return;
        }

        TaskNode temp = head;
        while (temp.next != head)
            temp = temp.next;

        temp.next = newNode;
        newNode.next = head;
    }

    //add at specific position 
    void addAtPosition(int pos, int id, String name, int priority, String date) {
        if (pos == 1) {
            addAtBeginning(id, name, priority, date);
            return;
        }

        TaskNode temp = head;
        for (int i = 1; i < pos - 1 && temp.next != head; i++)
            temp = temp.next;

        TaskNode newNode = new TaskNode(id, name, priority, date);
        newNode.next = temp.next;
        temp.next = newNode;
    }

    //remove task by ID
    void removeById(int id) {
        if (head == null) return;

        
        if (head.taskId == id && head.next == head) {
            head = current = null;
            return;
        }

        
        if (head.taskId == id) {
            TaskNode temp = head;
            while (temp.next != head)
                temp = temp.next;

            temp.next = head.next;
            head = head.next;
            return;
        }

        TaskNode curr = head;
        while (curr.next != head && curr.next.taskId != id)
            curr = curr.next;

        if (curr.next.taskId == id)
            curr.next = curr.next.next;
        else
            System.out.println("Task not found");
    }

    //view current task and move to next
    void viewNextTask() {
        if (current == null) {
            System.out.println("No tasks available");
            return;
        }

        displayTask(current);
        current = current.next;
    }

    //display all tasks
    void displayAll() {
        if (head == null) return;

        TaskNode temp = head;
        do {
            displayTask(temp);
            temp = temp.next;
        } while (temp != head);
    }

    //search by priority
    void searchByPriority(int priority) {
        if (head == null) return;

        TaskNode temp = head;
        do {
            if (temp.priority == priority)
                displayTask(temp);
            temp = temp.next;
        } while (temp != head);
    }

    void displayTask(TaskNode t) {
        System.out.println(
            t.taskId + " | " +
            t.taskName + " | Priority: " +
            t.priority + " | Due: " + t.dueDate
        );
    }
}
