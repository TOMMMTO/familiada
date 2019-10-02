package com.sda.familiada.familiada.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Question {

    @Id
    @GeneratedValue(generator = "questSeq")
    @SequenceGenerator(name = "questSeq", sequenceName = "quest_seq", allocationSize = 1)
    private Long id;
    private String question;

    public Question() {
    }

    public Question(String question) {
        this.question = question;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
        if (o == null || getClass() != o.getClass()) return false;
        Question question = (Question) o;
        return Objects.equals(id, question.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}



