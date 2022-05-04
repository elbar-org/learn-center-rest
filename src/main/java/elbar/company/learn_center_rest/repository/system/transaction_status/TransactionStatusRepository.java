package elbar.company.learn_center_rest.repository.system.transaction_status;

import elbar.company.learn_center_rest.entity.system.transaction_status.TransactionStatus;
import elbar.company.learn_center_rest.repository.BaseRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.UUID;

@Repository
public interface TransactionStatusRepository extends JpaRepository<TransactionStatus, Integer>, BaseRepository {
    @Transactional
    void deleteByCode(UUID code);

    TransactionStatus getByCode(UUID code);
}
