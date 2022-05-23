package elbar.company.learn_center_rest.dto.auth.teacher;

import elbar.company.learn_center_rest.dto.GenericDTO;
import lombok.*;

import javax.validation.constraints.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class TeacherUpdateDTO extends GenericDTO {
    @Min(value = 1, message = "{auth.teacher.userId.min.size}")
    @NotBlank(message = "{auth.teacher.userId.required}")
    private Integer userId;
    @Size(min = 10, max = 120, message = "{auth.language.name.length}")
    @NotBlank(message = "{auth.teacher.experience.required}")
    private String experience;
    @Min(value = 5, message = "{experience.min.size}")
    @Max(value = 80, message = "{experience.max.size}")
    @NotBlank(message = "{auth.teacher.age.required}")
    private Integer age;
    @Size(min = 10, message = "{auth.language.name.length}")
    @NotBlank(message = "{auth.teacher.about.required}")
    private String about;
}
