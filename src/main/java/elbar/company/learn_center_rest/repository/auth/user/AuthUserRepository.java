package elbar.company.learn_center_rest.repository.auth.user;

import elbar.company.learn_center_rest.entity.auth.user.AuthUser;
import elbar.company.learn_center_rest.repository.BaseRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.UUID;

@Repository
public interface AuthUserRepository extends JpaRepository<AuthUser, Integer>, BaseRepository {
    AuthUser findByUsername(String username);

    @Transactional
    @Query(value = "select r.name from auth.role r inner join auth.auth_user_role aur on r.id = aur.role_id inner join auth.auth_user au on aur.user_id = au.id where au.is_deleted = false and au.code = :code", nativeQuery = true)
    List<String> getRolesByCode(UUID code);

    AuthUser findByCode(UUID code);
}
