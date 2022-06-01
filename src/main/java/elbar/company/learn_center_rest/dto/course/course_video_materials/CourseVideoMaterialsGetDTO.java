package elbar.company.learn_center_rest.dto.course.course_video_materials;

import elbar.company.learn_center_rest.dto.GenericDTO;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CourseVideoMaterialsGetDTO extends GenericDTO {
    private Integer videoId;

    private String file;
}
