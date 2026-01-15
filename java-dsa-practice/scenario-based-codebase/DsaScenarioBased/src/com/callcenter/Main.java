package com.callcenter;

public class Main {
    public static void main(String[] args) {

        CallCenter manager = new CallCenter();

        Customer c1 = new Customer("C1", "Ananya", false);
        Customer c2 = new Customer("C2", "Bhanu", true);
        Customer c3 = new Customer("C3", "Tina", false);
        Customer c4 = new Customer("C2", "Priya", true);

        manager.addCall(c1);
        manager.addCall(c2);
        manager.addCall(c3);
        manager.addCall(c4);

        manager.serveNext();
        manager.serveNext();
        manager.serveNext();

        manager.showCallCount("C2");
        manager.showCallCount("C1");
    }
}
