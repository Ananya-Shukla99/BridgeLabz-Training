package com.stack.sortusingrecursion;

import java.util.Stack;

class RecursiveStack {

    //function to sort the stack
    static void sortStack(Stack<Integer> stack) {
    	
        if (stack.isEmpty()) {
            return;
        }

        int top = stack.pop();

        //sort remaining stack
        sortStack(stack);

        //insert top element at correct position
        insertSorted(stack, top);
    }

    //function to insert element in sorted order
    static void insertSorted(Stack<Integer> stack, int element) {
        //base case
        if (stack.isEmpty() || stack.peek() <= element) {
            stack.push(element);
            return;
        }

        int top = stack.pop();

        //recursive call
        insertSorted(stack, element);

        //push back the popped element
        stack.push(top);
    }
}
