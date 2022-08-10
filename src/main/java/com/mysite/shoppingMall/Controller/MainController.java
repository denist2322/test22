package com.mysite.shoppingMall.Controller;

import com.mysite.shoppingMall.Repository.ProductRepository;
import com.mysite.shoppingMall.Repository.QuestionRepository;
import com.mysite.shoppingMall.Vo.Product;
import com.mysite.shoppingMall.Vo.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class MainController {
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private QuestionService questionService;
    @Autowired
    private QuestionRepository questionRepository;

    @RequestMapping("/main")
    public String showMain() {
        return "pages/main.html";
    }

    @RequestMapping("/")
    public String rootMain() {
        return "redirect:/main";
    }

    @RequestMapping("/test")
    public String showTest(Model model) {
        Product product = productRepository.findById(1L).get();
        int discountPrice = (int)(product.getPrice() * (product.getDiscount() / 100));
        model.addAttribute("product", product);
        model.addAttribute("discountPrice", discountPrice);
        return "product/productDetail.html";
    }

    @RequestMapping("/test2")
    public String showTest2(Model model){
        List<Question> questionList = questionService.getList(2);
        model.addAttribute("questionList",questionList);

        return "user/test.html";
    }

}
