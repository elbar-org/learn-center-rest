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
    private String username;
    private String password;
    private String email;
    private String image;
    private String language;
    private String status;
}
