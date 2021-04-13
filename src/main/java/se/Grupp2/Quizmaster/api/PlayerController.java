package se.Grupp2.Quizmaster.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import se.Grupp2.Quizmaster.models.Player;
import se.Grupp2.Quizmaster.services.PlayerService;

@RestController
@RequestMapping("index")
public class PlayerController {

    @Autowired
    PlayerService playerService;

    @PostMapping
    public Player addPlayer(@RequestBody Player player) {
        return playerService.addPlayer(player);
    }
}
