package com.stack.queueusingstacks;

import java.util.Stack;

public class ImplementingQueue {

	//Initialization
	Stack<Integer> s1=new Stack<>();
	Stack<Integer> s2=new Stack<>();
	
	//Enqueue operation
	void enqueue(int x) {
		s1.push(x);
		System.out.println(x +" enqueue");
	}
	
	//Dequeue operation
	int dequeue() {
		if(s1.isEmpty() && s2.isEmpty()) {
			System.out.println("Queue is empty");
			return -1;
		}
		
		 //transfer elements if s2 is empty
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }

        return s2.pop();
    }
	
	//peek front element
    int peek() {
        if (s1.isEmpty() && s2.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }

        return s2.peek();
    }

    //check if queue is empty
    boolean isEmpty() {
        return s1.isEmpty() && s2.isEmpty();
    }
}

