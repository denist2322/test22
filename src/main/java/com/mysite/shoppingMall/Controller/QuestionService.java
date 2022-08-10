package com.mysite.shoppingMall.Controller;

import com.mysite.shoppingMall.Repository.QuestionRepository;
import com.mysite.shoppingMall.Vo.Question;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class QuestionService {

    private final QuestionRepository questionRepository;

    public List<Question> getList(Integer id) {
        List<Question> questionList = questionRepository.findByMallUserId(2);
        return questionList;
    }
}
