package se.Grupp2.Quizmaster.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import se.Grupp2.Quizmaster.services.DiceService;
import se.Grupp2.Quizmaster.services.QuestionService;
import se.Grupp2.Quizmaster.services.TileService;

@Controller
public class BoardController {

    @Autowired
    TileService tileService;

    @Autowired
    DiceService diceService;

    @Autowired
    QuestionService questionService;

    @RequestMapping("/game")
    public String startGame(Model model) {
        model.addAttribute("tiles",tileService.populateTiles());
        model.addAttribute("gameDice",diceService.diceRoll());
        model.addAttribute("question", questionService.getQuestion());
        return "game";
    }
}
