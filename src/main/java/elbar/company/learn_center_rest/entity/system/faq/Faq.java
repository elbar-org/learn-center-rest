package elbar.company.learn_center_rest.entity.system.faq;

import elbar.company.learn_center_rest.entity.Auditable;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "faq", schema = "system")
public class Faq extends Auditable {
    @Column(name = "question", nullable = false, length = 300)
    private String question;

    @Lob
    @Column(name = "answer", nullable = false)
    private String answer;

    @Column(name = "is_published")
    private boolean isPublished;
}
