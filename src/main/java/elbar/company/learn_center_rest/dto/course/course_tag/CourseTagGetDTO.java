package elbar.company.learn_center_rest.dto.course.course_tag;

import elbar.company.learn_center_rest.dto.GenericDTO;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CourseTagGetDTO extends GenericDTO {
    private Integer courseId;

    private Integer tagId;
}
