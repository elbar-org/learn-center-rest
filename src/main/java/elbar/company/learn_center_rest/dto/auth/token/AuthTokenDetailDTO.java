package elbar.company.learn_center_rest.dto.auth.token;

import elbar.company.learn_center_rest.dto.GenericDTO;
import lombok.*;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import java.util.Date;
import java.util.UUID;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class AuthTokenDetailDTO extends GenericDTO {
    private UUID userCode;
    private String token;
    private Date duration;
    private String type;
}
