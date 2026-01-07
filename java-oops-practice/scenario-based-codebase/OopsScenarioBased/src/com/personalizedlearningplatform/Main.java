package com.personalizedlearningplatform;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        ICertifiable learner1 = new ShortTermCourse("Aman" , "amann@mail.com", 101);

        ICertifiable learner2 = new FullTimeLearner("Manoj", "Manoj@mail.com", 102);
     
        
        learner1.generateCertificate();
        learner2.generateCertificate();

        List<String> questions = List.of("Q1", "Q2", "Q3");
        List<String> answers = List.of("A", "B", "C");

        Quiz quiz = new Quiz(questions, answers, 2);
        quiz.addScore(4);
        

        System.out.println("Quiz Percentage: " + quiz.getPercentage());
        
    }
}
