package elbar.company.learn_center_rest.entity.auth.teacher;

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
@Table(name = "teacher", schema = "auth")
public class Teacher extends Auditable {
    @Column(name = "user_id", nullable = false)
    private Integer userId;

    @Column(name = "experience", nullable = false, length = 120)
    private String experience;

    @Column(name = "age", nullable = false)
    private Integer age;

    @Column(name = "about", nullable = false)
    private String about;
}
