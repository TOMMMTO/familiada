package com.sda.familiada.familiada.controller;

import com.sda.familiada.familiada.model.Answer;
import com.sda.familiada.familiada.model.Question;
import com.sda.familiada.familiada.service.AnswerService;
import com.sda.familiada.familiada.service.QuestionService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
//TODO dodac liste odpowiedzi generowana automatycznie z pytaniem. Mozna sie do niej odwolywac podczas sprawdzania odpowiedzi.
@Controller
public class AnswerController {

    private final AnswerService answerService;


    public AnswerController(AnswerService answerService, QuestionService questionService) {
        this.answerService = answerService;
    }

/*
    @GetMapping("/answerTable")
    public ModelAndView showAnswer() {
        return new ModelAndView ("answerTable");
    }

*/
 /*   @GetMapping("/answerTable")
    public ModelAndView showAnswer() {
        List<Question> questions = answerService.getQuestionsList();
        String randomQuestion = questionService.getRandomQuestion().getQuestion();
        ModelAndView modelAndView = new ModelAndView("answerTable");
        modelAndView.addObject("question", randomQuestion);
        modelAndView.addObject("questionList", questions);
        return modelAndView;
}
*/
    @GetMapping("/answerTable")
    public ModelAndView showAnswer() {
        Question randomQuestion = answerService.getRandomQuestion();
        List<Answer> answersForQuestion = answerService.getAnswersForQuestion(randomQuestion.getId());
        ModelAndView modelAndView = new ModelAndView("answerTable");
        modelAndView.addObject("randomQuestion", randomQuestion);
        modelAndView.addObject("answersForQuestion", answersForQuestion);
        modelAndView.addObject("correct" , true);
        modelAndView.addObject("id" , answersForQuestion.get(1).getId());
        return modelAndView;
    }
}
