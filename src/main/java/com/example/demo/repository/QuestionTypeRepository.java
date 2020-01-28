package com.example.demo.repository;

import com.example.demo.model.QuestionType;
import com.example.demo.model.QuestionTypeId;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionTypeRepository extends CrudRepository<QuestionType, QuestionTypeId> {

}
