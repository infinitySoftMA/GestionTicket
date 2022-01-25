package ma.infinitysof.teammanagement.auth.repo;

import ma.infinitysof.teammanagement.auth.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role,Long> {
    Role findByName(String name);
}
