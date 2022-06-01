package elbar.company.learn_center_rest.dto.course.course_certificate;

import elbar.company.learn_center_rest.dto.BaseDTO;
import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CourseCertificateCreateDTO implements BaseDTO {
    @Size(min = 1, max = 120, message = "{course.course.certificate.name.size}")
    @NotBlank(message = "{course.course.certificate.name.required}")
    private String name;

    @Size(min = 3, max = 300, message = "{course.course.certificate.description.size}")
    @NotBlank(message = "{course.course.certificate.description.required}")
    private String description;

    @NotBlank(message = "{course.course.certificate.image.required}")
    private String image;

    @NotNull(message = "{course.course.certificate.course_id.required}")
    private Integer courseId;

    @NotNull(message = "{course.course.certificate.is_published.required}")
    private Boolean isPublished;
}
