package elbar.company.learn_center_rest.dto.course.course_rating;

import elbar.company.learn_center_rest.dto.GenericDTO;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CourseRatingGetDTO extends GenericDTO {
    private Integer courseId;

    private Integer views;

    private Integer stars;

    private Integer buyers;
}
