package elbar.company.learn_center_rest.repository.auth.user_role;

import elbar.company.learn_center_rest.entity.auth.user_role.AuthUserRole;
import elbar.company.learn_center_rest.repository.BaseRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface UserRoleRepository extends JpaRepository<AuthUserRole, Integer>, BaseRepository {
    @Transactional
    void deleteByCode(UUID code);

    Optional<AuthUserRole> getByCode(UUID code);
}
