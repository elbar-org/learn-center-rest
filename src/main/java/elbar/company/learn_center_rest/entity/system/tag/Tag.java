package elbar.company.learn_center_rest.entity.system.tag;

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
@Table(name = "tag", schema = "system")
public class Tag extends Auditable {
    @Column(name = "name", nullable = false, length = 120)
    private String name;

    @Column(name = "is_published")
    private boolean isPublished;
}
