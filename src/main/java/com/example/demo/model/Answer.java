package com.example.demo.model;

import static javax.persistence.CascadeType.ALL;
import static javax.persistence.FetchType.LAZY;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
public class Answer {

  @EmbeddedId
  private AnswerId answerId;

  private String questionAnswer;

  @ManyToOne(fetch = LAZY, cascade = ALL)
  @JoinColumn(name = "question_code", referencedColumnName = "code",
      foreignKey = @ForeignKey(name = "fk_question_answer"), insertable = false, updatable = false)
  private Question question;

  public Answer() {
  }

  public Answer(String prospectId, String questionCode, String questionAnswer) {
    this.answerId = new AnswerId(prospectId, questionCode);
    this.questionAnswer = questionAnswer;
  }

  public AnswerId getAnswerId() {
    return answerId;
  }

  public void setAnswerId(AnswerId answerId) {
    this.answerId = answerId;
  }

  public String getQuestionAnswer() {
    return questionAnswer;
  }

  public void setQuestionAnswer(String questionAnswer) {
    this.questionAnswer = questionAnswer;
  }

  public Question getQuestion() {
    return question;
  }

  public void setQuestion(Question question) {
    this.question = question;
  }

  @Override
  public String toString() {
    return "Answer [answerId=" + answerId + ", questionAnswer=" + questionAnswer + ", question="
        + question + "]";
  }

}
