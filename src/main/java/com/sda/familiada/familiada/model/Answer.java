package com.sda.familiada.familiada.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Answer {
    @Id
    @GeneratedValue(generator = "answerSeq")
    @SequenceGenerator(name = "answerSeq", sequenceName = "answer_seq", allocationSize = 1)
    private Long id;
    @ManyToOne(targetEntity = Question.class)
    private Question question;
    private String answer;
    private int points;

    public Answer() {
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestionId(Question questionId) {
        this.question = questionId;
    }

    public Answer(Question questionId, String answer, int points) {
        this.question = questionId;
        this.answer = answer;
        this.points = points;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Answer answer = (Answer) o;
        return Objects.equals(id, answer.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
