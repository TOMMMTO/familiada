package com.sda.familiada.familiada.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import java.util.Objects;

@Entity
public class QuestionsTest {

    @Id
    @GeneratedValue(generator = "questSeq")
    @SequenceGenerator(name = "questSeq", sequenceName = "quest_seq")
    @SequenceGenerator(name = "questSeq", sequenceName = "quest_seq", allocationSize = 1)
    private Long id;
    private String question;

    public QuestionsTest() {
    }

    public QuestionsTest(String question) {
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
        if (!(o instanceof QuestionsTest)) return false;
        QuestionsTest that = (QuestionsTest) o;
        return Objects.equals(getId(), that.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
