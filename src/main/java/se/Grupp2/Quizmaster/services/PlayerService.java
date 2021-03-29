package se.Grupp2.Quizmaster.services;

import org.springframework.stereotype.Service;
import se.Grupp2.Quizmaster.models.Player;

@Service
public class PlayerService {

    Player[] players;

    public void movePlayer(int playerNumber, int diceRoll, int currentPosition){
        players[playerNumber].setPosition(diceRoll, currentPosition);
    }
}
