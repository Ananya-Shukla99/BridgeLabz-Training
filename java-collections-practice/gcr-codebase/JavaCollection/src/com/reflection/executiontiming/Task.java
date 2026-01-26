package com.reflection.executiontiming;

class Task {

    public void fastTask() {
        for (int i = 0; i < 100000; i++);
    }

    public void slowTask() {
        for (int i = 0; i < 100000000; i++);
    }
}