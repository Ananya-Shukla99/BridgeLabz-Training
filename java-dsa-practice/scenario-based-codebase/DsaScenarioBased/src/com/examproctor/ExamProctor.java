package com.examproctor;

import java.util.*;

class ExamProctor {

    Stack<Integer> navigation = new Stack<>();          // Question history
    HashMap<Integer, String> answers = new HashMap<>(); // questionID-answer

    public void visitQuestion(int questionID) {
        navigation.push(questionID);
        System.out.println("Visited Question " + questionID);
    }

    public void submitAnswer(int questionID, String answer) {
        answers.put(questionID, answer);
        System.out.println("Answer saved for Question " + questionID);
    }

    public int goBack() {
        if (navigation.isEmpty()) {
            System.out.println("No previous question");
            return -1;
        }
        return navigation.pop();
    }

    public int calculateScore(HashMap<Integer, String> correctAnswers) {
        int score = 0;

        for (int qid : correctAnswers.keySet()) 
        {
            String correct = correctAnswers.get(qid);
            String student = answers.get(qid);

            if (correct.equalsIgnoreCase(student)) {
                score++;
            }
        }
        
        return score;
    }
}
