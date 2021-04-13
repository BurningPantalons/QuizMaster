package se.Grupp2.Quizmaster.services;

import org.springframework.stereotype.Service;
import se.Grupp2.Quizmaster.models.Tile;

import java.util.ArrayList;
import java.util.List;

@Service
public class TileService {

    private List<Tile> tiles = new ArrayList<>();
    private int numberOfBuffs = 3;
    private int numberOfDebuffs = 3;
    private int numberOfTiles = 30;

   public List<Tile> populateTiles() {
        Tile startTile = new Tile(0,
                true,
                false,
                false,
                false);
                tiles.add(startTile);
        for (int i = 1; i <= numberOfTiles; i++){
            if (i == numberOfTiles){
                Tile finishTile = new Tile(i,
                        true,
                        false,
                        false,
                        false);
                tiles.add(finishTile);
            } else {
                Tile questionTile = new Tile(i,
                        false,
                        true,
                        false,
                        false);
                tiles.add(questionTile);
            }
        }
       return tiles;
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
        addDebuff(numberOfDebuffs);
    }

    private void addDebuff(int numberOfDebuffs) {
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
}
