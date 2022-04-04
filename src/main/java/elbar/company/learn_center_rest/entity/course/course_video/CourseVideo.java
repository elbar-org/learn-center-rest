package elbar.company.learn_center_rest.entity.course.course_video;

import elbar.company.learn_center_rest.entity.Auditable;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "course_video", schema = "course")
public class CourseVideo extends Auditable {
    @Column(name = "course_id", nullable = false)
    private Integer courseId;

    @Lob
    @Column(name = "video", nullable = false)
    private String video;

    @Column(name = "time", nullable = false)
    private LocalDateTime time;

    @Column(name = "is_published")
    private boolean isPublished;
}
