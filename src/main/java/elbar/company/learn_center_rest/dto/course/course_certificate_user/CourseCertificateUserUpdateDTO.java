package elbar.company.learn_center_rest.dto.course.course_certificate_user;

import elbar.company.learn_center_rest.dto.GenericDTO;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CourseCertificateUserUpdateDTO extends GenericDTO {
    private Integer userId;

    private Integer certificateId;
}
