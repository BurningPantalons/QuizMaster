package se.Grupp2.Quizmaster.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class StartController {

    @RequestMapping("/index")
    public String start(){
        return "index";
    }

}
