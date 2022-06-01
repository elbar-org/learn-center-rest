package elbar.company.learn_center_rest.dto.course.course_video_source_code;

import elbar.company.learn_center_rest.dto.BaseDTO;
import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CourseVideoSourceCodeCreateDTO implements BaseDTO {
    @NotNull(message = "{course.course.video.source.code.video_id.required}")
    private Integer videoId;

    @NotBlank(message = "{course.course.video.source.code.file.required}")
    private String file;
}
