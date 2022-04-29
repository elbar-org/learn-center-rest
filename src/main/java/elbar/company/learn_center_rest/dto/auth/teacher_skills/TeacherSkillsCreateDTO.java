package elbar.company.learn_center_rest.dto.auth.teacher_skills;

import elbar.company.learn_center_rest.dto.BaseDTO;
import lombok.*;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class TeacherSkillsCreateDTO implements BaseDTO {
    @NotBlank(message = "{auth.teacher_skills.teacherId.required}")
    private Integer teacherId;
    @NotBlank(message = "{auth.teacher_skills.skillId.required}")
    private Integer skillId;
}
