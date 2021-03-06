package elbar.company.learn_center_rest.dto.auth.block;

import elbar.company.learn_center_rest.dto.GenericDTO;
import lombok.*;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AuthBlockGetDTO extends GenericDTO {
    private Integer userId;
    private String duration;
    private String blockedReason;
}
