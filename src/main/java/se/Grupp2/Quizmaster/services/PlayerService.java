package se.Grupp2.Quizmaster.services;

import se.Grupp2.Quizmaster.models.Player;

public class PlayerService {

    Player[] players;

    public void movePlayer(int nop, int diceRoll){
        players[nop].setPosition(diceRoll);
    }
}
