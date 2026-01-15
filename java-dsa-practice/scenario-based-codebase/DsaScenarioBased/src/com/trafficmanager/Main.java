package com.trafficmanager;

public class Main {
    public static void main(String[] args) {

        TrafficManager tm = new TrafficManager();

        tm.addToQueue("Car1");
        tm.addToQueue("Car2");
        tm.addToQueue("Car3");

        tm.enterRoundabout();
        tm.enterRoundabout();

        tm.printRoundabout();

        tm.exitRoundabout("Car1");
        tm.printRoundabout();

        tm.enterRoundabout();
        tm.printRoundabout();
    }
}
