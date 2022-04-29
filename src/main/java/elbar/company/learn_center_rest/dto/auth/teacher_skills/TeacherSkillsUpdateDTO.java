package elbar.company.learn_center_rest.dto.auth.teacher_skills;

import elbar.company.learn_center_rest.dto.GenericDTO;
import lombok.*;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class TeacherSkillsUpdateDTO extends GenericDTO {
    @NotBlank(message = "{auth.teacher_skills.teacherId.required}")
    private Integer teacherId;
    @NotBlank(message = "{auth.teacher_skills.skillId.required}")
    private Integer skillId;
}
