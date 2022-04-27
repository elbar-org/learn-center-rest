package elbar.company.learn_center_rest.dto.auth.teacher;

import elbar.company.learn_center_rest.dto.GenericDTO;
import lombok.*;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class TeacherDetailDTO extends GenericDTO {
    @NotBlank(message = "{auth.teacher.userId.required}")
    private Integer userId;
    @NotBlank(message = "{auth.teacher.experience.required}")
    private String experience;
    @NotBlank(message = "{auth.teacher.age.required}")
    private Integer age;
    @NotBlank(message = "{auth.teacher.about.required}")
    private String about;
}
