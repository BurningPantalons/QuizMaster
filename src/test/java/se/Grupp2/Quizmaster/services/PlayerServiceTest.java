package se.Grupp2.Quizmaster.services;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import se.Grupp2.Quizmaster.dao.PlayerDAO;
import se.Grupp2.Quizmaster.models.dto.PlayerDTO;
import java.util.List;


@ExtendWith(MockitoExtension.class)
class PlayerServiceTest {

    public static PlayerDAO playerDAO;
    public static PlayerService playerService;
    public List<PlayerDTO> players;

    @BeforeAll
    public static void init() {
        playerDAO = Mockito.mock(PlayerDAO.class);
        playerService = new PlayerService(playerDAO);
    }

    @Test
    void movePlayer() {
    }

    @Test
    void addPlayer() {
    }

    @Test
    void changeName() {
    }

    @Test
    void getPlayerById() {
    }

    @Test
    void getAllPlayers() {
    }

    @Test
    void deletePlayer() {
    }
}