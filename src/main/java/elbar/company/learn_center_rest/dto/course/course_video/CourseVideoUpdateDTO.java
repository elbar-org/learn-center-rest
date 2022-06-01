package elbar.company.learn_center_rest.dto.course.course_video;

import elbar.company.learn_center_rest.dto.GenericDTO;
import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CourseVideoUpdateDTO extends GenericDTO {
    @NotNull(message = "{course.course.video.course_id.required}")
    private Integer courseId;

    @NotBlank(message = "{course.course.video.video.required}")
    private String video;

    @NotBlank(message = "{course.course.video.time.required}")
    private LocalDateTime time;

    @NotNull(message = "{course.course.video_is_published.required}")
    private Boolean isPublished;
}
