package elbar.company.learn_center_rest.dto.auth.user_role;

import elbar.company.learn_center_rest.dto.BaseDTO;
import lombok.*;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserRoleCreateDTO implements BaseDTO {
    @NotBlank(message = "{auth.user_role.roleId.required}")
    private Integer roleId;
    @NotBlank(message = "{auth.user_role.userId.required}")
    private Integer userId;
}
