package elbar.company.learn_center_rest.dto.auth.teacher_skills;

import elbar.company.learn_center_rest.dto.GenericDTO;
import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class TeacherSkillsGetDTO extends GenericDTO {
    private Integer teacherId;
    private Integer skillId;
}
