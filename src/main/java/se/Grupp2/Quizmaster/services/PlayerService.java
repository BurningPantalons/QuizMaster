package se.Grupp2.Quizmaster.services;

import se.Grupp2.Quizmaster.models.Player;

public class PlayerService {

    Player[] players;

    public void movePlayer(int playerNumber, int diceRoll){
        players[playerNumber].setPosition(diceRoll);
    }
}
