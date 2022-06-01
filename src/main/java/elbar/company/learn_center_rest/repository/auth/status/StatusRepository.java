package elbar.company.learn_center_rest.repository.auth.status;

import elbar.company.learn_center_rest.entity.auth.status.Status;
import elbar.company.learn_center_rest.repository.BaseRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface StatusRepository extends JpaRepository<Status, Integer>, BaseRepository {
    @Transactional
    void deleteByCode(UUID key);

    Optional<Status> getByCode(UUID code);
}
