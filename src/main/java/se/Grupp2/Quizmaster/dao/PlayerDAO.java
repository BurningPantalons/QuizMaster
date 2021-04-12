package se.Grupp2.Quizmaster.dao;

import org.springframework.stereotype.Repository;
import se.Grupp2.Quizmaster.Repository.PlayerRepository;
import se.Grupp2.Quizmaster.models.dto.PlayerDTO;

@Repository
public class PlayerDAO {

    private final PlayerRepository playerRepository;

    public PlayerDAO(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    public PlayerDTO addPlayer(PlayerDTO playerDTO) {
        return playerRepository.save(playerDTO);
    }
}
