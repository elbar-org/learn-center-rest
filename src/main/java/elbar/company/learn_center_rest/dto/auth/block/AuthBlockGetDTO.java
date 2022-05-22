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
    @NotNull(message = "{auth.auth_block.userId.required}")
    private Integer userId;
    @NotBlank(message = "{auth.auth_block.duration.required}")
    private LocalDateTime duration;
    @NotBlank(message = "{auth.auth_block.blockedReason.required}")
    private String blockedReason;
}
