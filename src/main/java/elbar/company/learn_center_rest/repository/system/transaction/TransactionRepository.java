package elbar.company.learn_center_rest.repository.system.transaction;

import elbar.company.learn_center_rest.entity.system.tag.Tag;
import elbar.company.learn_center_rest.entity.system.transaction.Transaction;
import elbar.company.learn_center_rest.repository.BaseRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.UUID;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Integer>, BaseRepository {
    @Transactional
    void deleteByCode(UUID code);

    Transaction getByCode(UUID code);
}
