package ma.infinitysof.teammanagement.auth.repo;

import ma.infinitysof.teammanagement.auth.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    User findByFirstName(String firstName);
}
