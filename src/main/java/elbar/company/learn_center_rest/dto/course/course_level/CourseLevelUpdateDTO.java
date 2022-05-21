package elbar.company.learn_center_rest.dto.course.course_level;

import elbar.company.learn_center_rest.dto.GenericDTO;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CourseLevelUpdateDTO extends GenericDTO {
    private Integer courseId;

    private Integer levelId;
}
