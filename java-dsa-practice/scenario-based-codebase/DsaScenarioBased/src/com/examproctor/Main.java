package com.examproctor;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        ExamProctor exam = new ExamProctor();

        exam.visitQuestion(1);
        exam.submitAnswer(1, "A");

        exam.visitQuestion(2);
        exam.submitAnswer(2, "C");

        exam.visitQuestion(3);
        exam.submitAnswer(3, "B");

        // Correct answer key
        HashMap<Integer, String> key = new HashMap<>();
        key.put(1, "A");
        key.put(2, "B");
        key.put(3, "B");

        int score = exam.calculateScore(key);
        System.out.println("Final Score = " + score);
    }
}
