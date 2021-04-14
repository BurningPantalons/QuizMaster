package se.Grupp2.Quizmaster.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import se.Grupp2.Quizmaster.models.ERole;
import se.Grupp2.Quizmaster.models.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
