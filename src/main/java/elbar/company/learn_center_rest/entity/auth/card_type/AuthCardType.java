package elbar.company.learn_center_rest.entity.auth.card_type;

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
@Table(name = "auth_card_type", schema = "auth")
public class AuthCardType extends Auditable {
    @Column(name = "name", nullable = false, unique = true, length = 120)
    private String name;

    @Column(name = "is_published")
    private boolean isPublished;
}
