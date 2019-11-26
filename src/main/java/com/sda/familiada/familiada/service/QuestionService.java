package com.sda.familiada.familiada.service;

import com.sda.familiada.familiada.exception.QuestionNotFoundException;
import com.sda.familiada.familiada.model.Question;
import com.sda.familiada.familiada.repository.QuestionRepository;
import org.apache.commons.math3.random.RandomDataGenerator;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuestionService {

    private final QuestionRepository questionRepository;

    public QuestionService(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    public List<Question> getQuestionList() {
        return questionRepository.findAll();
    }

    public Question getRandomId() {
        long id = new RandomDataGenerator().nextLong(1, questionRepository.getMaxId());
        return questionRepository.findById(id).orElseThrow(() -> new QuestionNotFoundException("Nie ma pytania z takim id: " + id));
    }

//    public List<Question> getFirstListOfQuestions() {
//        List<Question> listOfQuestions = new ArrayList<>();
//        for (int i = 1; i <= 5; i++){
//            long id = new RandomDataGenerator().nextLong(1, questionRepository.getMaxId());
//            Question question = questionRepository.findById(id).orElseThrow(() -> new QuestionNotFoundException("Nie ma pytania z takim id: " + id));
//        }
//        return listOfQuestions;
//    }
}
