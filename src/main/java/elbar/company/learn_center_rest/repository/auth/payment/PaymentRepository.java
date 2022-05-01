package elbar.company.learn_center_rest.repository.auth.payment;

import elbar.company.learn_center_rest.entity.auth.payment.AuthPayment;
import elbar.company.learn_center_rest.repository.BaseRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.UUID;

@Repository
public interface PaymentRepository extends JpaRepository<AuthPayment, Integer>, BaseRepository {
    @Transactional
    void deleteByCode(UUID code);

    AuthPayment getByCode(UUID code);
}
