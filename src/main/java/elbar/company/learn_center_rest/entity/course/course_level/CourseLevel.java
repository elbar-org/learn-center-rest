package elbar.company.learn_center_rest.entity.course.course_level;

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
@Table(name = "course_level", schema = "course")
public class CourseLevel extends Auditable {
    @Column(name = "course_id", nullable = false, updatable = false)
    private Integer courseId;

    @Column(name = "level_id", nullable = false, updatable = false)
    private Integer levelId;
}
