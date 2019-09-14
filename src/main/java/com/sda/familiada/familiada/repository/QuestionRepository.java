package com.sda.familiada.familiada.repository;

import com.sda.familiada.familiada.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;



public interface QuestionRepository extends JpaRepository<Question, Long> {

    @Query("SELECT coalesce(max(q.id), 0) FROM Question q")
    Long getMaxId();
}
