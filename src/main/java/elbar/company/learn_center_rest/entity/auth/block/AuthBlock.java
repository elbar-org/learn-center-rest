package elbar.company.learn_center_rest.entity.auth.block;

import elbar.company.learn_center_rest.entity.Auditable;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "auth_block", schema = "auth")
public class AuthBlock extends Auditable {
    @Column(name = "user_id", nullable = false, updatable = false)
    private Integer userId;

    @Column(name = "duration", nullable = false)
    private LocalDateTime duration;

    @Column(name = "blocked_reason", nullable = false, length = 120)
    private String blockedReason;
}
