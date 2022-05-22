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
    @NotNull(message = "{auth.user_role.roleId.required}")
    private Integer roleId;
    @NotNull(message = "{auth.user_role.userId.required}")
    private Integer userId;
}
