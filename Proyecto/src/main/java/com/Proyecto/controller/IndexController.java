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
}
