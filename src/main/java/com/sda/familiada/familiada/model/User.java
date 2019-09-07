package com.sda.familiada.familiada.model;

import javax.persistence.Embeddable;

@Embeddable
public class User {

    public String username;
    public int score;

    public User() {}

    public User(String username, int score) {
        this.username = username;
        this.score = score;

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
