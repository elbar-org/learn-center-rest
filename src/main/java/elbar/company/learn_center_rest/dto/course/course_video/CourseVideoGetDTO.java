package elbar.company.learn_center_rest.dto.course.course_video;

import elbar.company.learn_center_rest.dto.GenericDTO;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CourseVideoGetDTO extends GenericDTO {
    private Integer courseId;

    private String video;

    private LocalDateTime time;

    private Boolean isPublished;
}
