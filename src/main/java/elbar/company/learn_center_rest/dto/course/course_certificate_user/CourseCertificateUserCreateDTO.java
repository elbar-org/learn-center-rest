package elbar.company.learn_center_rest.dto.course.course_certificate_user;

import elbar.company.learn_center_rest.dto.BaseDTO;
import lombok.*;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CourseCertificateUserCreateDTO implements BaseDTO {
    @NotNull(message = "{course.course.certificate.user.user_id.required}")
    private Integer userId;

    @NotNull(message = "{course.course.certificate.user.certificate_id.required}")
    private Integer certificateId;
}
