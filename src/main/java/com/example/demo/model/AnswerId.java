package com.example.demo.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@SuppressWarnings("serial")
@Embeddable
public class AnswerId implements Serializable {

  private String prospectId;

  @Column(name = "question_code")
  private String questionCode;

  public AnswerId() {
  }

  public AnswerId(String prospectId, String questionCode) {
    this.prospectId = prospectId;
    this.questionCode = questionCode;
  }

  public String getProspectId() {
    return prospectId;
  }

  public void setProspectId(String prospectId) {
    this.prospectId = prospectId;
  }

  public String getQuestionCode() {
    return questionCode;
  }

  public void setQuestionCode(String questionCode) {
    this.questionCode = questionCode;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((prospectId == null) ? 0 : prospectId.hashCode());
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
    AnswerId other = (AnswerId) obj;
    if (prospectId == null) {
      if (other.prospectId != null) {
        return false;
      }
    } else if (!prospectId.equals(other.prospectId)) {
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
    return "AnswerId [prospectId=" + prospectId + ", questionCode=" + questionCode + "]";
  }

}
