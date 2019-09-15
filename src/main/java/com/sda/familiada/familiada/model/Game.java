package com.sda.familiada.familiada.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Game {

    @Id
    @GeneratedValue(generator = "gameSeq")
    @SequenceGenerator(name = "gameSeq", sequenceName = "game_seq", allocationSize = 1)
    private Long id;

    @ManyToOne(targetEntity = User.class)
    private User user1;
    @ManyToOne(targetEntity = User.class)
    private User user2;


    public Game(User user1, User user2) {
        this.user1 = user1;
        this.user2 = user2;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser1() {
        return user1;
    }

    public void setUser1(User user1) {
        this.user1 = user1;
    }

    public User getUser2() {
        return user2;
    }

    public void setUser2(User user2) {
        this.user2 = user2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Game game = (Game) o;
        return Objects.equals(id, game.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}






