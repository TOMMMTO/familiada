package com.sda.familiada.familiada.model;

import javax.persistence.*;

@Entity
public class User {
    @Id
    @GeneratedValue(generator = "userSeq")
    @SequenceGenerator(name = "userSeq", sequenceName = "user_seq", allocationSize = 1)
    private long userId;
    private String username;
    private int score;

    public User() {
    }

    public User(String username, int score) {
        this.username = username;
        this.score = score;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
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
