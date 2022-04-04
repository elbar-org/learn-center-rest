package elbar.company.learn_center_rest.entity.course.course_certificate_user;

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
@Table(name = "course_certificate_user", schema = "course")
public class CourseCertificateUser extends Auditable {
    @Column(name = "user_id", nullable = false)
    private Integer userId;

    @Column(name = "certificate_id", nullable = false)
    private Integer certificateId;
}
