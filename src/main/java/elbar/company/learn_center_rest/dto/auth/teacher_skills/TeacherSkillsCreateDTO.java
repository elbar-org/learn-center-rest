package elbar.company.learn_center_rest.dto.auth.teacher_skills;

import elbar.company.learn_center_rest.dto.BaseDTO;
import lombok.*;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class TeacherSkillsCreateDTO implements BaseDTO {
    @Min(value = 1, message = "{auth.teacher_skills.teacherId.min.size}")
    @NotBlank(message = "{auth.teacher_skills.teacherId.required}")
    private Integer teacherId;
    @Min(value = 1, message = "{auth.teacher_skills.skillId.min.size}")
    @NotBlank(message = "{auth.teacher_skills.skillId.required}")
    private Integer skillId;
}
