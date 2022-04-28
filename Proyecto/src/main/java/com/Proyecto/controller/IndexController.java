package com.Proyecto.controller;

import com.Proyecto.service.PostService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;

@Controller
@Slf4j
public class IndexController {

    @Autowired
    private PostService postService;

    @GetMapping("/")
    public String index(Model model) {
        
        return "index";
    }
    @GetMapping("/Page01.html")
    public String page01(Model model) {
        
        return "Page01";
    }
    @GetMapping("/Page02.html")
    public String page02(Model model) {
        
        return "Page02";
    }
    @GetMapping("/Recommendations.html")
    public String Reco(Model model) {
        
        return "Recommendations";
    }
    @GetMapping("/Restaurants.html")
    public String Rest(Model model) {
        
        return "Restaurants";
    }
}
