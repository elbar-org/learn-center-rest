package elbar.company.learn_center_rest.dto.course.course_category;

import elbar.company.learn_center_rest.dto.GenericDTO;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CourseCategoryDetailDTO extends GenericDTO {
    private String title;

    private String description;

    private Boolean isPublished;
}
