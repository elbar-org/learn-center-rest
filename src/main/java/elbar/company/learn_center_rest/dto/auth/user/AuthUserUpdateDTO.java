package elbar.company.learn_center_rest.dto.auth.user;

import elbar.company.learn_center_rest.dto.GenericDTO;
import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class AuthUserUpdateDTO extends GenericDTO {
    @Size(min = 6, max = 120, message = "{user.username.size}")
    @NotBlank(message = "{user.username.required}")
    private String username;

    @Size(min = 8, max = 300, message = "{user.password.size}")
    @NotBlank(message = "{user.password.required}")
    private String password;

    @Size(min = 10, max = 120, message = "{user.email.size}")
    @NotBlank(message = "{user.email.required}")
    private String email;

    private String image;

    @Size(min = 2, max = 120, message = "{user.language.size}")
    @NotBlank(message = "{user.language.required}")
    private String language;

    @Size(min = 2, max = 120, message = "{user.status.size}")
    @NotBlank(message = "{user.status.required}")
    private String status;
}
