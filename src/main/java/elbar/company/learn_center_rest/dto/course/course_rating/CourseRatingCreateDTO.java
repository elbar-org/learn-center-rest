package elbar.company.learn_center_rest.dto.course.course_rating;

import elbar.company.learn_center_rest.dto.BaseDTO;
import lombok.*;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CourseRatingCreateDTO implements BaseDTO {
    @NotNull(message = "{course.course.rating.course_id.required}")
    private Integer courseId;
}
