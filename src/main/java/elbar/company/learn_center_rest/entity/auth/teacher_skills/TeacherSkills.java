package elbar.company.learn_center_rest.entity.auth.teacher_skills;

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
@Table(name = "teacher_skills", schema = "auth")
public class TeacherSkills extends Auditable {
    @Column(name = "teacher_id", nullable = false)
    private Integer teacherId;

    @Column(name = "skill_id", nullable = false)
    private Integer skillId;
}
