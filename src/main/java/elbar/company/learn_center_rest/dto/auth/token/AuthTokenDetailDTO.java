package elbar.company.learn_center_rest.dto.auth.token;

import elbar.company.learn_center_rest.dto.GenericDTO;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class AuthTokenDetailDTO extends GenericDTO {
    private String test;
}
