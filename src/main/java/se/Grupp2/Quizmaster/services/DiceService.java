package se.Grupp2.Quizmaster.services;

import org.springframework.stereotype.Service;
import se.Grupp2.Quizmaster.models.Dice;

@Service
public class DiceService {

    private int numberOfSides = 6;

    Dice gameDice = new Dice(numberOfSides);

     public Dice diceRoll(){
         int result = (int)(Math.random()* gameDice.getNumberOfSides() + 1);
         gameDice.setCurrentRoll(result);
         return gameDice;
    }

}