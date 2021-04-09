package se.Grupp2.Quizmaster.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import se.Grupp2.Quizmaster.services.DiceService;
import org.springframework.ui.Model;
import se.Grupp2.Quizmaster.models.Dice;

@RestController
@RequestMapping("/game")
public class DiceController {

    @Autowired
    DiceService diceService;

    @GetMapping
    public Dice getDiceRoll() {
       return diceService.diceRoll();

    }

}

