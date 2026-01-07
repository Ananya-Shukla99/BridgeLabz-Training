package com.personalizedlearningplatform;

import java.util.List;

class Quiz {

    //Internal questions
    private List<String> questions;

    //Answers list
    private final List<String> answers;

    private int score;
    private int totalMarks;

    //Constructor (normal difficulty)
    public Quiz(List<String> questions, List<String> answers) {
        this.questions = questions;
        this.answers = answers;
        this.totalMarks = questions.size();
        this.score = 0;
    }

    //Constructor (variable difficulty)
    public Quiz(List<String> questions, List<String> answers, int difficulty) {
        this.questions = questions;
        this.answers = answers;
        this.totalMarks = questions.size() * difficulty;
        this.score = 0;
    }

    //Scoring
    public void addScore(int marks) {
        score += marks;
    }

    //Percentage calculation
    public double getPercentage() {
        return (double) score / totalMarks * 100;
    }
}
