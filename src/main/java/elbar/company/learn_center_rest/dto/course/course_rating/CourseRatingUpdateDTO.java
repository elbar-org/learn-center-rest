package elbar.company.learn_center_rest.dto.course.course_rating;

import elbar.company.learn_center_rest.dto.GenericDTO;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CourseRatingUpdateDTO extends GenericDTO {
    private Integer views;

    private Integer stars;

    private Integer buyers;
}
