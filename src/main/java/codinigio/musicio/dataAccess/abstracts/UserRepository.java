package codinigio.musicio.dataAccess.abstracts;

import codinigio.musicio.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {      //Why integer?
}
