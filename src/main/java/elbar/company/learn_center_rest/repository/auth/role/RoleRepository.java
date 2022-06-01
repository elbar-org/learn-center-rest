package elbar.company.learn_center_rest.repository.auth.role;

import elbar.company.learn_center_rest.entity.auth.role.Role;
import elbar.company.learn_center_rest.repository.BaseRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer>, BaseRepository {
    void deleteByCode(UUID code);

    Optional<Role> getByCode(UUID code);
}
