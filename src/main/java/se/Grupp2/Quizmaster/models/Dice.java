package se.Grupp2.Quizmaster.models;


public class Dice {

    private int numberOfSides;
    private int currentRoll;

    public Dice(int numberOfSides) {
        this.numberOfSides = numberOfSides;
        this.currentRoll = 0;
    }

    public int getNumberOfSides() {
        return numberOfSides;
    }

    public void setCurrentRoll(int roll) {
        this.currentRoll = roll;
    }

    public int getCurrentRoll() {
        return currentRoll;
    }
}





