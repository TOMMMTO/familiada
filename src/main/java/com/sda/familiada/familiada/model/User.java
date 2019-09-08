package com.sda.familiada.familiada.model;

import javax.persistence.*;

@Entity
public class User {
    @Id
    @GeneratedValue(generator = "userIdSeq")
    @SequenceGenerator(name = "userIdSeq", sequenceName = "userId_seq", allocationSize = 1)
    long userId;
    public String username;
    public int score;

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
