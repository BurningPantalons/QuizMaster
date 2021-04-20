package se.Grupp2.Quizmaster.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.Grupp2.Quizmaster.dao.PlayerDAO;
import se.Grupp2.Quizmaster.models.Player;
import se.Grupp2.Quizmaster.models.dto.PlayerDTO;

import java.util.ArrayList;
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

    public Player changeName(Player player, Integer id) {
        Player playerToUpdate = getPlayerById(id);

            playerToUpdate.setName(player.getName());
            playerToUpdate.setId(id);

            PlayerDTO updatedPlayer = playerDAO.addPlayer(convertFromPlayer(playerToUpdate));
        return convertToPlayer(updatedPlayer);
    }

    public Player getPlayerById(Integer id) {
    if (playerDAO.findPlayerById(id).isPresent()) {
        return convertToPlayer(playerDAO.findPlayerById(id).get());
    }
    return null;
    }

    public List<Player> getAllPlayers() {
        List<Player> players = new ArrayList<>();
        for (PlayerDTO playerDTO : playerDAO.getAllPlayers()){
            Player player = convertToPlayer(playerDTO);
            players.add(player);
        }
        return players;
    }

    public void deletePlayer(Integer id) {
        playerDAO.removePlayer(id);
    }

    private PlayerDTO convertFromPlayer(Player player) {
        return new PlayerDTO(player.getId(), player.getName());
    }

    private Player convertToPlayer(PlayerDTO playerDTO) {
        return new Player(playerDTO.getId(), playerDTO.getName());
    }
}
