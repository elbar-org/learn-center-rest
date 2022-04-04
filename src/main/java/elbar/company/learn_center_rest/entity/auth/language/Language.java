package elbar.company.learn_center_rest.entity.auth.language;

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
@Table(name = "language", schema = "auth")
public class Language extends Auditable {
    @Column(name = "name", nullable = false, unique = true, length = 120)
    private String name;

    @Column(name = "is_published")
    private boolean isPublished;
}
