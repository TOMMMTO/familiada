package com.sda.familiada.familiada.model;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class Jokes {
    @Id
    @GeneratedValue(generator = "jokesSeq")
    @SequenceGenerator(name = "jokesSeq", sequenceName = "jokes_seq", allocationSize = 1)
    private Long id;
    private String joke;
    private String answer;

    public Jokes() {
    }

    public Jokes(String joke, String answer) {
        this.joke = joke;
        this.answer = answer;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getJoke() {
        return joke;
    }

    public void setJoke(String joke) {
        this.joke = joke;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }


}
