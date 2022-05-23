package elbar.company.learn_center_rest.dto.course.course_like;

import elbar.company.learn_center_rest.dto.BaseDTO;
import lombok.*;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CourseLikeCreateDTO implements BaseDTO {
    @NotNull(message = "{course.course.like.course_id.required}")
    private Integer courseId;

    @NotNull(message = "{course.course.like.user_id.required}")
    private Integer userId;
}
