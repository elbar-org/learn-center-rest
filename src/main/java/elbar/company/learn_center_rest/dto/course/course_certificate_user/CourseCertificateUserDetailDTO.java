package elbar.company.learn_center_rest.dto.course.course_certificate_user;

import elbar.company.learn_center_rest.dto.GenericDTO;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CourseCertificateUserDetailDTO extends GenericDTO {
    private Integer userId;

    private Integer certificateId;
}
