package se.Grupp2.Quizmaster.models;

public class Tile {

    private boolean hasBuff;
    private boolean hasDeBuff;
    private boolean startFinishTile;
    private boolean questionTile;

    private int position;

    private int numberOfBuffs = 3;
    private int numberOfDebuffs = 3;

    Tile[] tiles;

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

    public void initTiles() {
        tiles = new Tile[30];
        populateTiles(tiles);
    }

    private void populateTiles(Tile[] tiles) {
        int i;
        Tile startTile = new Tile(0,
                true,
                false,
                false,
                false);
        for (i = 1; i > tiles.length; i++){
                Tile questionTile = new Tile(i,
                        false,
                        true,
                        false,
                        false);
                setQuestion();
        }
        addBuff();
    }

    private void addBuff() {
        int buffedTiles = 0;
        double rng = Math.random() * 100;
        while ( buffedTiles < numberOfBuffs ){
            for (Tile t: tiles) {
               if (rng <= 5.0 && t.startFinishTile == false && t.hasBuff == false) {
                   t.hasBuff = true;
                   buffedTiles++;
               }
            }
        }
        addDebuff();
    }

    private void addDebuff() {
        int debuffTiles = 0;
        double rng = Math.random() * 100;
        while ( debuffTiles < numberOfDebuffs ){
            for (Tile t: tiles) {
                if (rng <= 5.0 && t.startFinishTile == false && t.hasBuff == false) {
                    t.hasDeBuff = true;
                    debuffTiles++;
                }
            }
        }
    }

    private void setQuestion() {
        //String question = getQuestion().random;
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
