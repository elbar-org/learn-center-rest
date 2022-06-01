package elbar.company.learn_center_rest.repository.auth.card;

import elbar.company.learn_center_rest.entity.auth.block_reason.AuthBlockReason;
import elbar.company.learn_center_rest.entity.auth.card.AuthCard;
import elbar.company.learn_center_rest.repository.BaseRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface CardRepository extends JpaRepository<AuthCard, Integer>, BaseRepository {
    @Transactional
    void deleteByCode(UUID code);

    Optional<AuthCard> getByCode(UUID code);
}
