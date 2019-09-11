package com.sda.familiada.familiada.service;


import com.sda.familiada.familiada.model.Jokes;
import com.sda.familiada.familiada.repository.JokeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JokeService {

    private final JokeRepository jokeRepository;

    public JokeService(JokeRepository jokeRepository) {
        this.jokeRepository = jokeRepository;
    }
    public List<Jokes> getJokeList() {
        List<Jokes> showAllJokes = jokeRepository.findAll();
        return showAllJokes;
    }
}
