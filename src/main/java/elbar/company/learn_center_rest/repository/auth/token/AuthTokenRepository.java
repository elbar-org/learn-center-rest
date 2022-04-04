package elbar.company.learn_center_rest.repository.auth.token;

import elbar.company.learn_center_rest.entity.auth.token.AuthToken;
import elbar.company.learn_center_rest.repository.BaseRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthTokenRepository extends JpaRepository<AuthToken, Integer>, BaseRepository {
}
