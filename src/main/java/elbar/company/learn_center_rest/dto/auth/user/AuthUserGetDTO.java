package elbar.company.learn_center_rest.dto.auth.user;

import elbar.company.learn_center_rest.dto.GenericDTO;
import lombok.*;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class AuthUserGetDTO extends GenericDTO {
    @NotBlank(message = "{user.username.required}")
    private String username;

    @NotBlank(message = "{user.password.required}")
    private String password;

    @NotBlank(message = "{user.email.required}")
    private String email;

    private String image;

    @NotBlank(message = "{user.language.required}")
    private String language;

    @NotBlank(message = "{user.status.required}")
    private String status;
}
