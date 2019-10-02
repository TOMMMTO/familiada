package com.sda.familiada.familiada.repository;

import com.sda.familiada.familiada.model.Answer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface AnswerRepository extends JpaRepository<Answer, Long> {

    @Query(value = "select * from answer where question_id = :id", nativeQuery = true)
    List<Answer> searchByQuestionId(Long id);
}


