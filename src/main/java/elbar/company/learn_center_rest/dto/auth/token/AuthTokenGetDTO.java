package elbar.company.learn_center_rest.dto.auth.token;

import elbar.company.learn_center_rest.dto.GenericDTO;
import lombok.*;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class AuthTokenGetDTO extends GenericDTO {
    @NotBlank(message = "{type.required}")
    private String type;

    @NotBlank(message = "{token.required}")
    private String token;
}
