package elbar.company.learn_center_rest.entity.auth.card;

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
@Table(name = "auth_card", schema = "auth")
public class AuthCard extends Auditable {
    @Column(name = "user_id", nullable = false, updatable = false)
    private Integer userId;

    @Column(name = "pan", nullable = false, length = 120)
    private String pan;

    @Column(name = "type", nullable = false, length = 120)
    private String type;

    @Column(name = "holder_name", nullable = false, length = 120)
    private String holderName;
}
