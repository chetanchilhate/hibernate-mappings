package com.example.demo.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@SuppressWarnings("serial")
@Embeddable
public class QuestionTypeId implements Serializable {

  @Column(name = "question_code")
  private String questionCode;

  private String prospectType;

  public QuestionTypeId() {
  }

  public QuestionTypeId(String questionCode, String prospectType) {
    this.questionCode = questionCode;
    this.prospectType = prospectType;
  }

  public String getQuestionCode() {
    return questionCode;
  }

  public void setQuestionCode(String questionCode) {
    this.questionCode = questionCode;
  }

  public String getProspectType() {
    return prospectType;
  }

  public void setProspectType(String prospectType) {
    this.prospectType = prospectType;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((prospectType == null) ? 0 : prospectType.hashCode());
    result = prime * result + ((questionCode == null) ? 0 : questionCode.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    QuestionTypeId other = (QuestionTypeId) obj;
    if (prospectType == null) {
      if (other.prospectType != null) {
        return false;
      }
    } else if (!prospectType.equals(other.prospectType)) {
      return false;
    }
    if (questionCode == null) {
      if (other.questionCode != null) {
        return false;
      }
    } else if (!questionCode.equals(other.questionCode)) {
      return false;
    }
    return true;
  }

  @Override
  public String toString() {
    return "QuestionTypeId [questionCode=" + questionCode + ", prospectType=" + prospectType + "]";
  }

}
