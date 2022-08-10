package com.mysite.shoppingMall;

import com.mysite.shoppingMall.Repository.QuestionRepository;
import com.mysite.shoppingMall.Vo.Question;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest

class ShoppingMallApplicationTests {

	@Autowired
	QuestionRepository questionRepository;

	@Test
	void contextLoads() {
		List<Question> questions =  this.questionRepository.findByMallUserId(2);
		for (Question question : questions
			 ) {
			System.out.println(question);
		}

	}

}
