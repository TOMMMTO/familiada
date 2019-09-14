package com.sda.familiada.familiada.controller;

import com.sda.familiada.familiada.model.Jokes;
import com.sda.familiada.familiada.model.User;
import com.sda.familiada.familiada.service.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class JokeController {

    private final JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @GetMapping("/jokes")
    public ModelAndView showAllJokes() {
        List<Jokes> jokes = jokeService.findAll();
        ModelAndView modelAndView = new ModelAndView("joke");
        modelAndView.addObject("jokes", jokes);
        return modelAndView;
    }
}
