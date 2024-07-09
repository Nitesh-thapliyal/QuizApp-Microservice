package com.nitesh.question_service.dao;

import com.nitesh.question_service.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionDao extends JpaRepository<Question, Integer> {

    List<Question> findByCategory(String category);  // JPA does the work for you

    @Query(value = "SELECT q.id FROM question q where q.category=:category ORDER BY RANDOM() LIMIT :mumQ", nativeQuery = true)
    List<Integer> findRandomQuestionsByCategory(String category, int numQ);
}
