package com.sda.familiada.familiada.controller;

import com.sda.familiada.familiada.service.QuestionService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;


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

}
