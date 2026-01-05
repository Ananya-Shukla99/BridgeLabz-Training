package com.hashmaps;

public class CustomHashMap {

    //node for Linked List
    class Node {
        int key;
        int value;
        Node next;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private int SIZE = 10;
    private Node[] table;

    //constructor
    public CustomHashMap() {
        table = new Node[SIZE];
    }

    //hash function
    private int hash(int key) {
        return key % SIZE;
    }

    // Insert / Update
    public void put(int key, int value) {
        int index = hash(key);
        Node head = table[index];

     
        Node curr = head;
        while (curr != null) {
            if (curr.key == key) {
                curr.value = value; // update
                return;
            }
            curr = curr.next;
        }

        // Insert new node at beginning
        Node newNode = new Node(key, value);
        newNode.next = head;
        table[index] = newNode;
    }

    // Retrieve
    public int get(int key) {
        int index = hash(key);
        Node curr = table[index];

        while (curr != null) {
            if (curr.key == key) {
                return curr.value;
            }
            curr = curr.next;
        }
        return -1; // key not found
    }

    // Delete
    public void remove(int key) {
        int index = hash(key);
        Node curr = table[index];
        Node prev = null;

        while (curr != null) {
            if (curr.key == key) {
                if (prev == null) {
                    table[index] = curr.next;
                } else {
                    prev.next = curr.next;
                }
                return;
            }
            prev = curr;
            curr = curr.next;
        }
    }

    // main method 
    public static void main(String[] args) {

        CustomHashMap map = new CustomHashMap();

        map.put(1, 10);
        map.put(2, 20);
        map.put(12, 120); 

        System.out.println(map.get(1));  
        System.out.println(map.get(2));
        System.out.println(map.get(12)); 

        map.remove(2);
        System.out.println(map.get(2)); 
    }
}
