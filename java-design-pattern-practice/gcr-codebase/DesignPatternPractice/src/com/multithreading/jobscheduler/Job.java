package com.multithreading.jobscheduler;

public class Job implements Runnable {

    private String name;
    private int pages;
    private int priority;

    // Shared printer
    private static final Object printer = new Object();

    public Job(String name, int pages, int priority) {
        this.name = name;
        this.pages = pages;
        this.priority = priority;
    }

    @Override
    public void run() {

        synchronized (printer) { 

            String level = getPriorityLevel(priority);

            for (int i = 1; i <= pages; i++) {

                try {
                    Thread.sleep(100); 
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("[" + level + "] Printing " +
                        name + " - Page " + i + " of " + pages);
            }

            System.out.println(name + " completed.\n");
        }
    }

    private String getPriorityLevel(int p) {

        if (p >= 7)
            return "High Priority";
        else if (p >= 5)
            return "Medium Priority";
        else
            return "Low Priority";
    }
}
