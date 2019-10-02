package com.sda.familiada.familiada.model;

public class QuestionsList {

    private Question question;

    public QuestionsList (Question question){
        this.question = question;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }
}
