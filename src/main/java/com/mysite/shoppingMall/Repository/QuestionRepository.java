package com.mysite.shoppingMall.Repository;

import com.mysite.shoppingMall.Vo.Question;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuestionRepository extends JpaRepository<Question, Integer> {
//    @Query("SELECT q FROM Question q  WHERE q.mall_user_id = 2")
//    List<Question> findQuestionList();

    List<Question> findByMallUserId(Integer id);
}
