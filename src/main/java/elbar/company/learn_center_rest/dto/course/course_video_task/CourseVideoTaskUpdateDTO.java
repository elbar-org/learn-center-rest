package elbar.company.learn_center_rest.dto.course.course_video_task;

import elbar.company.learn_center_rest.dto.GenericDTO;
import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CourseVideoTaskUpdateDTO extends GenericDTO {
    @NotNull(message = "{course.course.video.task.video_id.required}")
    private Integer videoId;

    @NotBlank(message = "{course.course.video.task.task.required}")
    private String task;

    @NotNull(message = "{course.course.video.task.is_published.required}")
    private Boolean isPublished;
}
