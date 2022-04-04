package elbar.company.learn_center_rest.dto.auth.user;

import elbar.company.learn_center_rest.dto.BaseDTO;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class AuthUserLoginDTO implements BaseDTO {
    private String username;
    private String password;
}
