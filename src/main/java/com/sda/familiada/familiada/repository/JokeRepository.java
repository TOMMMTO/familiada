package com.sda.familiada.familiada.repository;


import com.sda.familiada.familiada.model.Jokes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JokeRepository extends JpaRepository<Jokes, String> {

}
