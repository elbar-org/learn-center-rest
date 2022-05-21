package elbar.company.learn_center_rest.dto.course.course_level;

import elbar.company.learn_center_rest.dto.BaseDTO;
import lombok.*;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CourseLevelCreateDTO implements BaseDTO {
    @NotNull(message = "{course.course.level.course_id.required}")
    private Integer courseId;

    @NotNull(message = "{course.course.level.level_id.required}")
    private Integer levelId;
}
