package se.Grupp2.Quizmaster.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import se.Grupp2.Quizmaster.models.Player;
import se.Grupp2.Quizmaster.services.PlayerService;

import java.util.List;

@RestController
@RequestMapping("players")
public class PlayerController {

    @Autowired
    PlayerService playerService;

    @GetMapping
    public List<Player> getAllPlayers() {
        return playerService.getAllPlayers();
    }

    @PostMapping
    public Player addPlayer(@RequestBody Player player) {
        return playerService.addPlayer(player);
    }

    @DeleteMapping("/{id}")
    public void removePlayer(@PathVariable ("id")Integer id){
        playerService.deletePlayer(id);
    }
}
