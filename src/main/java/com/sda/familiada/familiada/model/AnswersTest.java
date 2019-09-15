package com.sda.familiada.familiada.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import java.util.Objects;

public class AnswersTest {
    @Id
    @GeneratedValue(generator = "questSeq")
    @SequenceGenerator(name = "questSeq", sequenceName = "quest_seq")
    @SequenceGenerator(name = "questSeq", sequenceName = "quest_seq", allocationSize = 1)
    private Long id;
    private String answer1;
    private int points1;
    private String answer2;
    private int points2;
    private String answer3;
    private int points3;
    private String answer4;
    private int points4;

    public AnswersTest() {
    }

    public AnswersTest(Long id, String answer1, int points1, String answer2, int points2, String answer3, int points3, String answer4, int points4) {
        this.id = id;
        this.answer1 = answer1;
        this.points1 = points1;
        this.answer2 = answer2;
        this.points2 = points2;
        this.answer3 = answer3;
        this.points3 = points3;
        this.answer4 = answer4;
        this.points4 = points4;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAnswer1() {
        return answer1;
    }

    public void setAnswer1(String answer1) {
        this.answer1 = answer1;
    }

    public int getPoints1() {
        return points1;
    }

    public void setPoints1(int points1) {
        this.points1 = points1;
    }

    public String getAnswer2() {
        return answer2;
    }

    public void setAnswer2(String answer2) {
        this.answer2 = answer2;
    }

    public int getPoints2() {
        return points2;
    }

    public void setPoints2(int points2) {
        this.points2 = points2;
    }

    public String getAnswer3() {
        return answer3;
    }

    public void setAnswer3(String answer3) {
        this.answer3 = answer3;
    }

    public int getPoints3() {
        return points3;
    }

    public void setPoints3(int points3) {
        this.points3 = points3;
    }

    public String getAnswer4() {
        return answer4;
    }

    public void setAnswer4(String answer4) {
        this.answer4 = answer4;
    }

    public int getPoints4() {
        return points4;
    }

    public void setPoints4(int points4) {
        this.points4 = points4;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AnswersTest)) return false;
        AnswersTest that = (AnswersTest) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
