package elbar.company.learn_center_rest.dto.course.course_like;

import elbar.company.learn_center_rest.dto.GenericDTO;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CourseLikeUpdateDTO extends GenericDTO {
    private Integer courseId;

    private Integer userId;
}
