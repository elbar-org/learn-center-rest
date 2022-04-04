package elbar.company.learn_center_rest.entity.course.course_video_task;

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
@Table(name = "course_video_task", schema = "course")
public class CourseVideoTask extends Auditable {
    @Column(name = "video_id", nullable = false, updatable = false)
    private Integer videoId;

    @Lob
    @Column(name = "task", nullable = false)
    private String task;

    @Column(name = "is_published")
    private boolean isPublished;
}
