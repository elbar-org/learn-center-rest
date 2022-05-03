package elbar.company.learn_center_rest.repository.system.level;

import elbar.company.learn_center_rest.entity.system.level.Level;
import elbar.company.learn_center_rest.repository.BaseRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.UUID;

@Repository
public interface LevelRepository extends JpaRepository<Level, Integer>, BaseRepository {

    @Transactional
    void deleteByCode(UUID code);

    Level getByCode(UUID code);
}
