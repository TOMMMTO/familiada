package com.sda.familiada.familiada.service;

import com.sda.familiada.familiada.exception.QuestionNotFoundException;
import com.sda.familiada.familiada.model.Answer;
import com.sda.familiada.familiada.model.Question;
import com.sda.familiada.familiada.repository.AnswerRepository;
import com.sda.familiada.familiada.repository.QuestionRepository;
import org.apache.commons.math3.random.RandomDataGenerator;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AnswerService {

    private final QuestionRepository questionRepository;
    private final AnswerRepository answerRepository;

    public AnswerService(QuestionRepository questionRepository, AnswerRepository answerRepository) {
        this.questionRepository = questionRepository;
        this.answerRepository = answerRepository;
    }

    //public List<Question> getQuestionsList(){
    //  List<Question> allQuestions = answerRepository.findAll();
    // List<QuestionsList> questionsList = new ArrayList<>();
    //allQuestions.forEach(question -> {
    //  List<QuestionsList> byQuestionId = questionRepository.findAll();
    // return allQuestions;
    // }


    public Question getRandomQuestion() {
        long id = new RandomDataGenerator().nextLong(1, questionRepository.getMaxId());
        return questionRepository.findById(id).orElseThrow(() -> new QuestionNotFoundException("" + id));
    }

    public List<Answer> getAnswersForQuestion(Long id) {
        return answerRepository.searchByQuestionId(id);
    }

    public Optional<Answer> getAllAnswers(Long id) {
        return answerRepository.findById(id);
    }

    public boolean checkAnswer(){
        return false;
    }

}
