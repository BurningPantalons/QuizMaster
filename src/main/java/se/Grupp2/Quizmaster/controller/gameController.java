package se.Grupp2.Quizmaster.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import se.Grupp2.Quizmaster.dao.BoardDAO;
import se.Grupp2.Quizmaster.services.BoardService;
import se.Grupp2.Quizmaster.services.TileService;

@Controller
public class gameController {

    @Autowired
    TileService tileservice;

    @Autowired
    BoardService boardservice;

    @RequestMapping("/index")
    public String start(){
        return "index";
    }


    @RequestMapping("/questions")
    public String showQuestions(){
        return "questions";
    }
}
