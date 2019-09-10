package com.sda.familiada.familiada.controller;

import com.sda.familiada.familiada.exception.QuestionNotFoundException;
import com.sda.familiada.familiada.exception.SameLongException;
import com.sda.familiada.familiada.model.Question;
import com.sda.familiada.familiada.service.QuestionService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class QuestionController {

    private final QuestionService questionService;

    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @GetMapping("/")
    public ModelAndView showQuestion() {

        String randomQuestion = questionService.getRandomId().getQuestion();
        ModelAndView modelAndView = new ModelAndView("question");
        modelAndView.addObject("question", randomQuestion);

        return modelAndView;
    }

//    @GetMapping("/question")
//    public String getRandomQuestion() {
//        return questionService.getRandomId().getQuestion();
//    }
}
