package elbar.company.learn_center_rest.repository.auth.card_type;

import elbar.company.learn_center_rest.entity.auth.card.AuthCard;
import elbar.company.learn_center_rest.entity.auth.card_type.AuthCardType;
import elbar.company.learn_center_rest.repository.BaseRepository;
import jdk.jfr.Registered;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.UUID;

@Repository
public interface CardTypeRepository extends JpaRepository<AuthCardType, Integer>, BaseRepository {
    @Transactional
    void deleteByCode(UUID code);

    AuthCardType getByCode(UUID code);
}
