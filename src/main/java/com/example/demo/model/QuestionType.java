package com.example.demo.model;

import static javax.persistence.CascadeType.ALL;
import static javax.persistence.FetchType.LAZY;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.hibernate.annotations.Immutable;

@Entity
@Table(name = "questiontype")
@Immutable
public class QuestionType {

  @EmbeddedId
  private QuestionTypeId questionTypeId;

  private Integer priority;

  @ManyToOne(fetch = LAZY, cascade = ALL)
  @JoinColumn(name = "question_code", referencedColumnName = "code",
      foreignKey = @ForeignKey(name = "fk_question_question_type"), insertable = false,
      updatable = false)
  private Question question;

  public QuestionType() {
  }

  /**
   * Java Doc's.
   */
  public QuestionType(String questionCode, String prospectType, Integer priority, String value) {
    this.questionTypeId = new QuestionTypeId(questionCode, prospectType);
    this.priority = priority;
    this.question = new Question(questionTypeId.getQuestionCode(), value);
  }

  public QuestionTypeId getQuestionTypeId() {
    return questionTypeId;
  }

  public void setQuestionTypeId(QuestionTypeId questionTypeId) {
    this.questionTypeId = questionTypeId;
  }

  public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  public Question getQuestion() {
    return question;
  }

  public void setQuestion(Question question) {
    this.question = question;
  }

  @Override
  public String toString() {
    return "QuestionType [questionTypeId=" + questionTypeId + ", priority=" + priority
        + ", question=" + question + "]";
  }

}
