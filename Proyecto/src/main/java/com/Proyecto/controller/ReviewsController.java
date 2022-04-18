package com.Proyecto.controller;

import com.Proyecto.domain.Post;
import com.Proyecto.service.PostService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


//HOLA
@Controller
@Slf4j
public class ReviewsController {
    
    @Autowired
    private PostService postService;
    
    
    @GetMapping("/reviews/{idPub}")
    public String verPost(Model model, Post post){
        var postDB = postService.getPost(post);
        
        model.addAttribute("postDB", postDB);
        return "reviews/testing";
    }
    
    @GetMapping("/reviews/Review.html")
    public String returnRev(Model model){
        var postsDB = postService.getPost();
        model.addAttribute("postsDB", postsDB);
        
        return "/templates/reviews";
    }
    
}
