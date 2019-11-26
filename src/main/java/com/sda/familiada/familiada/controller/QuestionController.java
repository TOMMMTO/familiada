package com.sda.familiada.familiada.controller;

import com.sda.familiada.familiada.model.Answer;
import com.sda.familiada.familiada.model.Question;
import com.sda.familiada.familiada.service.AnswerService;
import com.sda.familiada.familiada.service.QuestionService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@Controller
public class QuestionController {

    private final QuestionService questionService;
    private final AnswerService answerService;

    public QuestionController(QuestionService questionService, AnswerService answerService) {
        this.questionService = questionService;
        this.answerService = answerService;
    }

    @GetMapping("/")
    public ModelAndView showQuestion() {

        Question randomQuestion = questionService.getRandomId();
        String questionString = randomQuestion.getQuestion();
        long id = randomQuestion.getId();
        List<Answer> answersToRandomQuestion = answerService.getAnswersForQuestion(id);
        ModelAndView modelAndView = new ModelAndView("question");
        modelAndView.addObject("question", questionString);
        modelAndView.addObject("answer1", answersToRandomQuestion.get(0).getAnswer());
        modelAndView.addObject("answer2", answersToRandomQuestion.get(1).getAnswer());
        modelAndView.addObject("answer3", answersToRandomQuestion.get(2).getAnswer());
        modelAndView.addObject("answer4", answersToRandomQuestion.get(3).getAnswer());

        return modelAndView;

    }

}
