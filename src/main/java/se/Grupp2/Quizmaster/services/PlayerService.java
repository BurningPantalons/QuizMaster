package se.Grupp2.Quizmaster.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.Grupp2.Quizmaster.dao.PlayerDAO;
import se.Grupp2.Quizmaster.models.Player;
import se.Grupp2.Quizmaster.models.dto.PlayerDTO;

import java.util.List;

@Service
public class PlayerService {

    private final PlayerDAO playerDAO;

    @Autowired
    public PlayerService(PlayerDAO playerDAO) {
        this.playerDAO = playerDAO;
    }

    List<Player> players;

    public void movePlayer(int playerNumber, int diceRoll, int currentPosition) {

        int newPosition = diceRoll + currentPosition;
        players.get(playerNumber).setPosition(newPosition);

    }

    public Player addPlayer(Player player) {
        PlayerDTO newPlayerDTO = playerDAO.addPlayer(convertFromPlayer(player));
        return convertToPlayer(newPlayerDTO);

    }

    private PlayerDTO convertFromPlayer(Player player) {
        return new PlayerDTO(player.getName(), player.getPassword());
    }

    private Player convertToPlayer(PlayerDTO playerDTO) {
        return new Player(playerDTO.getName(), playerDTO.getPassword());
    }
}
