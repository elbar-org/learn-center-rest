package elbar.company.learn_center_rest.dto.auth.user_role;

import elbar.company.learn_center_rest.dto.GenericDTO;
import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserRoleDetailDTO extends GenericDTO {
    private Integer roleId;
    private Integer userId;
}
