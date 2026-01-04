package com.singlylinkedlist.studentrecordmanagement;

public class StudentLinkedList {

	 StudentRecord head;

	    //Add at beginning of list 
	    void addAtBeginning(int rollNo, String name, int age, char grade) {
	    	StudentRecord newNode = new StudentRecord(rollNo, name, age, grade);
	        newNode.next = head;
	        head = newNode;
	    }

	    //Add at end of list 
	    void addAtEnd(int rollNo, String name, int age, char grade) {
	    	StudentRecord newNode = new StudentRecord(rollNo, name, age, grade);

	        if (head == null) {
	            head = newNode;
	            return;
	        }

	        StudentRecord temp = head;
	        while (temp.next != null) {
	            temp = temp.next;
	        }
	        temp.next = newNode;
	    }

	    //Add at specific position 
	    void addAtPosition(int position, int rollNo, String name, int age, char grade) {
	        if (position == 1) {
	            addAtBeginning(rollNo, name, age, grade);
	            return;
	        }

	        StudentRecord newNode = new StudentRecord(rollNo, name, age, grade);
	        StudentRecord temp = head;

	        for (int i = 1; i < position - 1 && temp != null; i++) {
	            temp = temp.next;
	        }

	        if (temp == null) {
	            System.out.println("Invalid position");
	            return;
	        }

	        newNode.next = temp.next;
	        temp.next = newNode;
	    }

	    // Delete by Roll Number
	    void deleteByRollNo(int rollNo) {
	        if (head == null) return;

	        if (head.rollNo == rollNo) {
	            head = head.next;
	            return;
	        }

	        StudentRecord temp = head;
	        while (temp.next != null && temp.next.rollNo != rollNo) {
	            temp = temp.next;
	        }

	        if (temp.next == null) {
	            System.out.println("Student not found");
	        } else {
	            temp.next = temp.next.next;
	        }
	    }

	    // Search by Roll Number
	    void search(int rollNo) {
	    	StudentRecord temp = head;
	        while (temp != null) {
	            if (temp.rollNo == rollNo) {
	                System.out.println("Found: " + temp.name + ", Grade: " + temp.grade);
	                return;
	            }
	            temp = temp.next;
	        }
	        System.out.println("Student not found");
	    }

	    // Update Grade
	    void updateGrade(int rollNo, char newGrade) {
	    	StudentRecord temp = head;
	        while (temp != null) {
	            if (temp.rollNo == rollNo) {
	                temp.grade = newGrade;
	                System.out.println("Grade updated");
	                return;
	            }
	            temp = temp.next;
	        }
	        System.out.println("Student not found");
	    }

	    // Display all records
	    void display() {
	    	StudentRecord temp = head;
	        while (temp != null) {
	            System.out.println(
	                temp.rollNo + " " + temp.name + " " + temp.age + " " + temp.grade
	            );
	            temp = temp.next;
	        }
	    }
}

