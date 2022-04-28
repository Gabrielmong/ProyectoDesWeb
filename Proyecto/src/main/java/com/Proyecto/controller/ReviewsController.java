package com.Proyecto.controller;

import com.Proyecto.domain.ArrozConLeche;
import com.Proyecto.domain.Post;
import com.Proyecto.service.ArrozConLecheService;
import com.Proyecto.service.ChicharroneraService;
import com.Proyecto.service.ChifrijoService;
import com.Proyecto.service.GalloPintoService;
import com.Proyecto.service.NovilloAlegreService;
import com.Proyecto.service.PasteleriaService;
import com.Proyecto.service.PatiService;
import com.Proyecto.service.PostService;
import com.Proyecto.service.TacosconrepolloService;
import com.Proyecto.service.VigoronService;
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
    @Autowired
    private ArrozConLecheService arrozConLecheService;
    @Autowired
    private ChifrijoService chifrijoService;
    @Autowired
    private PatiService patiService;
    @Autowired
    private GalloPintoService galloPintoService;
    @Autowired
    private TacosconrepolloService tacosconrepolloService;
    @Autowired
    private VigoronService vigoronService;
    @Autowired
    private ChicharroneraService chicharroneraService;
    @Autowired
    private NovilloAlegreService novilloAlegreService;
    @Autowired
    private PasteleriaService pasteleriaService;
    
    
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
    
    @GetMapping("/tablas/ArrozConLeche")
    public String verArroz(Model model){
        
        var entrada = arrozConLecheService.getArrozConLeche();
        model.addAttribute("entrada", entrada);
        
        return "/tablas/Tabla1";
    }
    @GetMapping("/tablas/Chifrijo")
    public String verChifrijo(Model model){
        
        var entrada = chifrijoService.getChifrijo();
        model.addAttribute("entrada", entrada);
        
        return "/tablas/Tabla1";
    }
    
    @GetMapping("/tablas/Pati")
    public String verPati(Model model){
        
        var entrada = patiService.getPati();
        model.addAttribute("entrada", entrada);
        
        return "/tablas/Tabla1";
    }
    
    @GetMapping("/tablas/GalloPinto")
    public String verGallo(Model model){
        
        var entrada = galloPintoService.getGalloPinto();
        model.addAttribute("entrada", entrada);
        
        return "/tablas/Tabla1";
    }
    
    @GetMapping("/tablas/Tacos")
    public String verTacos(Model model){
        
        var entrada = tacosconrepolloService.getTacosconrepollo();
        model.addAttribute("entrada", entrada);
        
        return "/tablas/Tabla1";
    }
    
    @GetMapping("/tablas/Vigoron")
    public String verVigoron(Model model){
        
        var entrada = vigoronService.getVigoron();
        model.addAttribute("entrada", entrada);
        
        return "/tablas/Tabla1";
    }
    
    @GetMapping("/tablas/Chicharronera")
    public String verChicha(Model model){
        
        var entrada = chicharroneraService.getChicharronera();
        model.addAttribute("entrada", entrada);
        
        return "/tablas/Tabla2";
    }
    
    @GetMapping("/tablas/Novillo")
    public String verNovillo(Model model){
        
        var entrada = novilloAlegreService.getNovilloAlegre();
        model.addAttribute("entrada", entrada);
        
        return "/tablas/Tabla2";
    }
    
    @GetMapping("/tablas/Pasteleria")
    public String verPasteleria(Model model){
        
        var entrada = pasteleriaService.getPasteleria();
        model.addAttribute("entrada", entrada);
        
        return "/tablas/Tabla2";
    }
}
