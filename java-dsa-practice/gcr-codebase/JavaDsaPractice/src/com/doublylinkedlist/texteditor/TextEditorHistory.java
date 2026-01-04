package com.doublylinkedlist.texteditor;

class TextEditorHistory {
	//private nodes
    private TextNode head;
    private TextNode tail;
    private TextNode current;
    private int size;
    private final int MAX_SIZE = 10;

    //add new text state
    void addState(String content) {
    	
        TextNode newNode = new TextNode(content);

        if (current != null && current.next != null) {
            current.next.prev = null;
            current.next = null;
            tail = current;
        }

        if (head == null) {
            head = tail = current = newNode;
            size = 1;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
        current = newNode;
        size++;

 
        if (size > MAX_SIZE) {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    //undo operation
    void undo() {
        if (current != null && current.prev != null) 
        {
            current = current.prev;
        } 
        else {
            System.out.println("Nothing to undo");
        }
    }

    //re do operation
    void redo() {
        if (current != null && current.next != null) {
            current = current.next;
        } 
        else {
            System.out.println("Nothing to redo");
        }
    }

    //display current state
    void displayCurrentState() {
        if (current != null)
        {
            System.out.println("Current Text: " + current.content);
        } else {
            System.out.println("No text available");
        }
    }
}
