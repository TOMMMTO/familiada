package com.sda.familiada.familiada.model;

import javax.persistence.Entity;
import java.util.Objects;

@Entity
public class QuestionsTest {


    private Long id_question;
    private String question;

    public QuestionsTest() {
    }

    public QuestionsTest(String question) {
        this.question = question;
    }

    public Long getId_question() {
        return id_question;
    }

    public void setId_question(Long id_question) {
        this.id_question = id_question;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof QuestionsTest)) return false;
        QuestionsTest that = (QuestionsTest) o;
        return Objects.equals(getId_question(), that.getId_question());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId_question());
    }
}
