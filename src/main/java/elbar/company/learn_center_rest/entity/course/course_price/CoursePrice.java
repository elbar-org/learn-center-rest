package elbar.company.learn_center_rest.entity.course.course_price;

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
@Table(name = "course_price", schema = "course")
public class CoursePrice extends Auditable {
    @Column(name = "course_id", nullable = false, updatable = false)
    private Integer courseId;

    @Column(name = "price", nullable = false, length = 30)
    private String price;

    @Column(name = "discount", nullable = false)
    private Integer discount;
}
