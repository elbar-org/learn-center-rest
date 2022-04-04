package elbar.company.learn_center_rest.entity.system.transaction;

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
@Table(name = "transaction", schema = "system")
public class Transaction extends Auditable {
    @Column(name = "course_id", nullable = false, updatable = false)
    private Integer courseId;

    @Column(name = "user_id", nullable = false, updatable = false)
    private Integer userId;

    @Column(name = "card_id", nullable = false, updatable = false)
    private Integer cardId;

    @Column(name = "quantity", nullable = false, updatable = false, length = 30)
    private String quantity;

    @Column(name = "status", nullable = false, updatable = false, length = 120)
    private String status;
}
