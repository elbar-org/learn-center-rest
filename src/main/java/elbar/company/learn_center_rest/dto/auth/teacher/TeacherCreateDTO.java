package elbar.company.learn_center_rest.dto.auth.teacher;

import elbar.company.learn_center_rest.dto.BaseDTO;
import lombok.*;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class TeacherCreateDTO implements BaseDTO {
    @NotNull
    @NotBlank(message = "{auth.teacher.userId.required}")
    private Integer userId;
    @Min(value = 10, message = "{experience.min.size}")
    @Max(value = 120, message = "{experience.max.size}")
    @NotBlank(message = "{auth.teacher.experience.required}")
    private String experience;
    @Min(value = 5, message = "{experience.min.size}")
    @Max(value = 80, message = "{experience.max.size}")
    @NotBlank(message = "{auth.teacher.age.required}")
    private Integer age;
    @Min(value = 100, message = "{experience.min.size}")
    @NotBlank(message = "{auth.teacher.about.required}")
    private String about;
}
