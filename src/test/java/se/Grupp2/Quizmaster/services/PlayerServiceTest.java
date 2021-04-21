package se.Grupp2.Quizmaster.services;


import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import se.Grupp2.Quizmaster.dao.PlayerDAO;
import se.Grupp2.Quizmaster.models.Player;
import se.Grupp2.Quizmaster.models.dto.PlayerDTO;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;


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

    @Nested
    class TestAllPlayers {

        @BeforeEach
        public void init() {
            players = new ArrayList<>();
            players.add(new PlayerDTO(1, "Marcus"));
            players.add(new PlayerDTO(2, "Rasmus"));
            players.add(new PlayerDTO(3, "David"));
            players.add(new PlayerDTO(4, "Stefan"));
        }

        @Test
        @DisplayName("Test if you get the right amount of players from the db")
        void getAllPlayersWithSize() {
            List<Player> expectedPlayers = new ArrayList<>();
            expectedPlayers.add(new Player(1, "Marcus"));
            expectedPlayers.add(new Player(2, "Rasmus"));
            expectedPlayers.add(new Player(3, "David"));
            expectedPlayers.add(new Player(4, "Stefan"));

            Mockito.when(playerDAO.getAllPlayers()).thenReturn(players);
            List<Player> playersFromDB = playerService.getAllPlayers();

            assertEquals(playersFromDB.size(),expectedPlayers.size());

        }

        @Test
        @DisplayName("Test if the playerdata in the db is correct")
        void getAllPlayersWithNameAndId() {
            List<Player> expectedPlayers = new ArrayList<>();
            expectedPlayers.add(new Player(1, "Marcus"));
            expectedPlayers.add(new Player(2, "Rasmus"));
            expectedPlayers.add(new Player(3, "David"));
            expectedPlayers.add(new Player(4, "Stefan"));

            Mockito.when(playerDAO.getAllPlayers()).thenReturn(players);
            List<Player> playersFromDB = playerService.getAllPlayers();

            assertEquals(playersFromDB.toString(),expectedPlayers.toString());

        }
    }

    @Test
    @DisplayName("Test if you can remove a player from db")
    void deletePlayer() {
        playerService.deletePlayer(1);
        Mockito.verify(playerDAO, Mockito.times(1)).removePlayer(1);
    }
}