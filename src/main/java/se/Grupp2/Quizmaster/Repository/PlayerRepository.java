package se.Grupp2.Quizmaster.Repository;

import org.springframework.data.repository.CrudRepository;
import se.Grupp2.Quizmaster.models.dto.PlayerDTO;

public interface PlayerRepository extends CrudRepository<PlayerDTO, Integer> {
}
