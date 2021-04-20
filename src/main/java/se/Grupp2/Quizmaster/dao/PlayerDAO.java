package se.Grupp2.Quizmaster.dao;

import org.springframework.stereotype.Repository;
import se.Grupp2.Quizmaster.Repository.PlayerRepository;
import se.Grupp2.Quizmaster.models.dto.PlayerDTO;

import java.util.Optional;

@Repository
public class PlayerDAO {

    private final PlayerRepository playerRepository;

    public PlayerDAO(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    public PlayerDTO addPlayer(PlayerDTO playerDTO) {
        return playerRepository.save(playerDTO);
    }

    public Iterable<PlayerDTO> getAllPlayers() {
        return playerRepository.findAll();
    }

    public Optional<PlayerDTO> findPlayerById(Integer id){
        return playerRepository.findById(id);
    }

    public void removePlayer(Integer id) {
        playerRepository.deleteById(id);
    }
}
