package elbar.company.learn_center_rest.repository.auth.token;

import elbar.company.learn_center_rest.entity.auth.teacher_skills.TeacherSkills;
import elbar.company.learn_center_rest.entity.auth.token.AuthToken;
import elbar.company.learn_center_rest.repository.BaseRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface AuthTokenRepository extends JpaRepository<AuthToken, Integer>, BaseRepository {
    @Transactional
    void deleteByCode(UUID key);

    Optional<AuthToken> getByCode(UUID code);
}
