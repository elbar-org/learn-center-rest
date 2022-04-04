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
    @Min(value = 5, message = "{type.min.size}")
    @NotBlank(message = "{type.required}")
    private String type;

    @Min(value = 5, message = "{token.min.size}")
    @NotBlank(message = "{token.required}")
    private String token;
}
