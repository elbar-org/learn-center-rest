package elbar.company.learn_center_rest.dto.auth.user;

import elbar.company.learn_center_rest.dto.GenericDTO;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class AuthUserGetDTO extends GenericDTO {
    private String test;
}
