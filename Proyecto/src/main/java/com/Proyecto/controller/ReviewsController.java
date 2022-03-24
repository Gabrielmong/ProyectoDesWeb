package com.Proyecto.controller;

import com.Proyecto.service.PostService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
@Slf4j
public class ReviewsController {
    
    @Autowired
    private PostService postService;
    
    @GetMapping("/Review.html")
    public String inicio (Model model){
        var postsDB = postService.getPost();
        model.addAttribute("postsDB", postsDB);
        
        return "reviews";
    }
    
    
}
