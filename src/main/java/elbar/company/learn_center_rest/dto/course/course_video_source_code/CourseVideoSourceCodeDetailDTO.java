package elbar.company.learn_center_rest.dto.course.course_video_source_code;

import elbar.company.learn_center_rest.dto.GenericDTO;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CourseVideoSourceCodeDetailDTO extends GenericDTO {
    private Integer videoId;

    private String file;
}
