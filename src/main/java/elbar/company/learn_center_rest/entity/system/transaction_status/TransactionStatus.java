package elbar.company.learn_center_rest.entity.system.transaction_status;

import elbar.company.learn_center_rest.entity.Auditable;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "transaction_status", schema = "system")
public class TransactionStatus extends Auditable {
    @Column(name = "name", nullable = false, length = 120)
    private String name;

    @Column(name = "is_published")
    private boolean isPublished;
}
