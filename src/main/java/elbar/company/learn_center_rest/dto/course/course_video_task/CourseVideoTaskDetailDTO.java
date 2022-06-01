package elbar.company.learn_center_rest.dto.course.course_video_task;

import elbar.company.learn_center_rest.dto.GenericDTO;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CourseVideoTaskDetailDTO extends GenericDTO {
    private Integer videoId;

    private String task;

    private Boolean isPublished;
}
