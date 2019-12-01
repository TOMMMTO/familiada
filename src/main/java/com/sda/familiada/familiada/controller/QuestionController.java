package com.sda.familiada.familiada.controller;

import com.sda.familiada.familiada.model.Answer;
import com.sda.familiada.familiada.model.Question;
import com.sda.familiada.familiada.service.AnswerService;
import com.sda.familiada.familiada.service.QuestionService;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static javafx.scene.input.KeyCode.T;


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

        com.sda.familiada.familiada.model.Question randomQuestion = questionService.getRandomQuestion();
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

    @GetMapping("/firstRound")
    public ModelAndView showFirstRound() {
        List<com.sda.familiada.familiada.model.Question> questionList = new ArrayList<>();
        List<com.sda.familiada.familiada.model.Question> usedQuestionList = new ArrayList<>();
        while (questionList.size() != 5) {
            com.sda.familiada.familiada.model.Question question = questionService.getRandomQuestion();
            if (!usedQuestionList.contains(question)) {
                questionList.add(question);
                usedQuestionList.add(question);
            } else {
                questionService.getRandomQuestion();
            }
        }
        ModelAndView modelAndView = new ModelAndView("roundOne");
        modelAndView.addObject("question1", questionList.get(0).getQuestion());
        modelAndView.addObject("question2", questionList.get(1).getQuestion());
        modelAndView.addObject("question3", questionList.get(2).getQuestion());
        modelAndView.addObject("question4", questionList.get(3).getQuestion());
        modelAndView.addObject("question5", questionList.get(4).getQuestion());
        return modelAndView;
    }

}
