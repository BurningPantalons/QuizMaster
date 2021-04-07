package se.Grupp2.Quizmaster.models;

public class Tile {

    private boolean hasBuff;
    private boolean hasDeBuff;
    private boolean startFinishTile;
    private boolean questionTile;

    private int position;

    public Tile(){
        hasBuff = false;
        hasDeBuff = false;
        startFinishTile = false;
        questionTile = false;
        position = 0;
    };

    public Tile(int position, boolean startFinishTile, boolean questionTile, boolean hasBuff, boolean hasDeBuff){
        this.position = position;
        this.startFinishTile = startFinishTile;
        this.questionTile = questionTile;
        this.hasBuff = hasBuff;
        this.hasDeBuff = hasDeBuff;
    }

    public void setHasBuff(boolean hasBuff) {
        this.hasBuff = hasBuff;
    }

    public void setHasDeBuff(boolean hasDeBuff) {
        this.hasDeBuff = hasDeBuff;
    }

    public void setStartFinishTile(boolean startFinishTile) {
        this.startFinishTile = startFinishTile;
    }

    public void setQuestionTile(boolean questionTile) {
        this.questionTile = questionTile;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public boolean isHasBuff() {
        return hasBuff;
    }

    public boolean isHasDeBuff() {
        return hasDeBuff;
    }

    public boolean isStartFinishTile() {
        return startFinishTile;
    }

    public boolean isQuestionTile() {
        return questionTile;
    }

    public int getPosition() {
        return position;
    }
}
