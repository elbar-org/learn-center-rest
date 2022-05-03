package elbar.company.learn_center_rest.repository.system.faq;

import elbar.company.learn_center_rest.entity.auth.block.AuthBlock;
import elbar.company.learn_center_rest.entity.system.faq.Faq;
import elbar.company.learn_center_rest.repository.BaseRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.UUID;

@Repository
public interface FaqRepository extends JpaRepository<Faq, Integer>, BaseRepository {

    @Transactional
    void deleteByCode(UUID code);

    Faq getByCode(UUID code);
}
