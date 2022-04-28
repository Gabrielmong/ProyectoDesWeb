
package com.Proyecto.controller;

import com.Proyecto.domain.Post;
import com.Proyecto.service.PostService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author gabri
 */
@Controller
@Slf4j
public class OverallController {
    
@Autowired
    private PostService postService;
    
    

    @GetMapping("/Review.html")
    public String inicio (Model model){
        var postsDB = postService.getPost();
        model.addAttribute("postsDB", postsDB);
        
        return "reviews/reviews";
    }
   
    
    @GetMapping("/eliminarPost/{idPub}")
    public String eliminarPost(Post post){
        postService.delete(post);
        return "redirect:/Review.html";
    }
    
    @GetMapping("/agregarPost")
    public String agregarPost(Post post){
        return "agregarPost";
    }
    
    @PostMapping("/guardarPost")
    public String guardarPost(Post post){
        postService.save(post);
        return "redirect:/Review.html";
    }
    
    @GetMapping("/editPost/{idPub}")
    public String modificarCliente(Post post, Model model) {
        var respuesta = postService.getPost(post);
        model.addAttribute("post", respuesta);

        return "/reviews/edit";
    }
    
    @GetMapping("/about")
    public String about(Post post){
        return "about";
    }
    
    
}
