package com.singlylinkedlist.studentrecordmanagement;

public class Main {
	//main method
    public static void main(String[] args) {

    	//creating objects
        StudentLinkedList list = new StudentLinkedList();

        //performing operation
        list.addAtBeginning(1, "Amit", 20, 'A');
        list.addAtEnd(2, "Neha", 21, 'B');
        list.addAtPosition(2, 3, "Rahul", 22, 'C');

        list.display();

        list.search(2);

        list.updateGrade(3, 'A');

        list.deleteByRollNo(1);

        System.out.println("After updates:");
        list.display();
    }
}
