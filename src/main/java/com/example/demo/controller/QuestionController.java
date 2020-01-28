package com.example.demo.controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import com.example.demo.model.Question;
import com.example.demo.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1", produces = APPLICATION_JSON_VALUE)
public class QuestionController {

  @Autowired
  private QuestionRepository questionRepository;

  @GetMapping("/questions")
  public Iterable<Question> getQuestions() {
    return questionRepository.findAll();
  }

  @GetMapping("/questions/{code}")
  public Question getQuestion(@PathVariable String code) {
    return questionRepository.findById(code).orElse(new Question("", ""));
  }

  @PostMapping("/questions")
  public Question saveQuestion(@RequestBody Question question) {
    return questionRepository.save(question);
  }

  @PutMapping("/questions")
  public Question updateQuestion(@RequestBody Question question) {
    return questionRepository.save(question);
  }

  @DeleteMapping("/questions/{code}")
  public void deleteQuestion(@PathVariable String code) {
    questionRepository.deleteById(code);
  }
}
