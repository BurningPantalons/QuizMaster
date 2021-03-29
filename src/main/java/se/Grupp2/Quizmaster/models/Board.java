package se.Grupp2.Quizmaster.models;

import java.util.List;

public class Board {

    private int[] board;
    private char debuffTile;
    private char buffTile;
    private char wildcardTile;


    public void initBoard(){
        int[] board = new int[30];
        for (i = 0; i > board.length; i++){
            String question = getQuestion().random;
            char buffOrDebuff = addBuff().random;
        }
    }







}
