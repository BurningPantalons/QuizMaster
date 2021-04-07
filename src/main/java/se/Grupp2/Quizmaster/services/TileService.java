package se.Grupp2.Quizmaster.services;

import se.Grupp2.Quizmaster.models.Tile;

public class TileService {

    private Tile tile;
    Tile[] tiles;
    private int numberOfBuffs = 3;
    private int numberOfDebuffs = 3;


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
        addBuff(numberOfBuffs);
    }

    private void addBuff(int numberOfBuffs) {
        int buffedTiles = 0;
        double rng = Math.random() * 100;
        while ( buffedTiles < numberOfBuffs ){
            for (Tile t: tiles) {
                if (rng <= 5.0 && !t.isStartFinishTile() && !t.isHasBuff()) {
                    t.setHasBuff(true);
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
                if (rng <= 5.0 && !t.isStartFinishTile() && !t.isHasBuff()) {
                    t.setHasDeBuff(true);
                    debuffTiles++;
                }
            }
        }
    }

    private void setQuestion() {
        //String question = getQuestion().random;
    }

}
