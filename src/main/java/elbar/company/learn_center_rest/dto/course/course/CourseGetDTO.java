package elbar.company.learn_center_rest.dto.course.course;

import elbar.company.learn_center_rest.dto.GenericDTO;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CourseGetDTO extends GenericDTO {
    private String title;

    private String description;

    private String content;

    private String image;

    private Integer categoryId;

    private Boolean isPublished;
}
