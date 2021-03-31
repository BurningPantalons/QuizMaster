package se.Grupp2.Quizmaster.services;

import org.springframework.stereotype.Service;
import se.Grupp2.Quizmaster.models.Player;

import java.util.List;

@Service
public class PlayerService {
    
    List<Player> players;

    public void movePlayer(int playerNumber, int diceRoll, int currentPosition) {

        int newPosition = diceRoll + currentPosition;
        players.get(playerNumber).setPosition(newPosition);

    }

    public void addPlayer(Player player) {

        players.add(player);

    }
}
