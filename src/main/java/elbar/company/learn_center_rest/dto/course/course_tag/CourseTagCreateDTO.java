package elbar.company.learn_center_rest.dto.course.course_tag;

import elbar.company.learn_center_rest.dto.BaseDTO;
import lombok.*;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CourseTagCreateDTO implements BaseDTO {
    @NotNull(message = "{course.course.tag.course_id.required}")
    private Integer courseId;

    @NotNull(message = "{course.course.tag.tag_id.required}")
    private Integer tagId;
}
