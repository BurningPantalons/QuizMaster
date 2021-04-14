package se.Grupp2.Quizmaster.models;

import java.util.List;

public class Question {
    private String question;
    private List<String> answers;
    private String correctAnswer;

    public Question(String question, List<String> answers, String correctAnswer) {
        this.question = question;
        this.answers = answers;
        this.correctAnswer = correctAnswer;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public String getQuestion() {
        return question;
    }

    public List<String> getAnswers() {
        return answers;
    }
}
