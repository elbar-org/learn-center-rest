package elbar.company.learn_center_rest.dto.course.course_certificate;

import elbar.company.learn_center_rest.dto.GenericDTO;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CourseCertificateUpdateDTO extends GenericDTO {
    private String name;

    private String description;

    private String image;

    private Integer courseId;

    private Boolean isPublished;
}
