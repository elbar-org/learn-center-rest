package elbar.company.learn_center_rest.repository.auth.block;

import elbar.company.learn_center_rest.entity.auth.block.AuthBlock;
import elbar.company.learn_center_rest.entity.auth.block_reason.AuthBlockReason;
import elbar.company.learn_center_rest.repository.BaseRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.UUID;

@Repository
public interface AuthBlockRepository extends JpaRepository<AuthBlock, Integer>, BaseRepository {

    @Transactional
    void deleteByCode(UUID code);

    AuthBlock getByCode(UUID code);
}
