package elbar.company.learn_center_rest.repository.auth.block_reason;

import elbar.company.learn_center_rest.entity.auth.block_reason.AuthBlockReason;
import elbar.company.learn_center_rest.repository.BaseRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface BlockReasonRepository extends JpaRepository<AuthBlockReason, Integer>, BaseRepository {

    @Transactional
    void deleteByCode(UUID code);

    Optional<AuthBlockReason> getByCode(UUID code);
}
