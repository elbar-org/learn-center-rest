package elbar.company.learn_center_rest.dto.auth.teacher;

import elbar.company.learn_center_rest.dto.GenericDTO;
import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class TeacherDetailDTO extends GenericDTO {
    private Integer userId;
    private String experience;
    private Integer age;
    private String about;
}
