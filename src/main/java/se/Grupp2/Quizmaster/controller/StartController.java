package se.Grupp2.Quizmaster.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import se.Grupp2.Quizmaster.services.PlayerService;


@Controller
public class StartController {

    @Autowired PlayerService playerService;

    @RequestMapping("/index")
    public String start(){
        return "index";
    }

    @RequestMapping("/create-game")
    public String showPlayersInGame(Model model) {
        model.addAttribute("players", playerService.getAllPlayers());
        return "create-game";
    }

}
