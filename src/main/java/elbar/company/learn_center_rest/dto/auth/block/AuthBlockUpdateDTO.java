package elbar.company.learn_center_rest.dto.auth.block;

import elbar.company.learn_center_rest.dto.GenericDTO;
import lombok.*;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AuthBlockUpdateDTO extends GenericDTO {
    @NotBlank(message = "{auth.auth_block.userId.required}")
    private Integer userId;
    @NotBlank(message = "{auth.auth_block.duration.required}")
    private LocalDateTime duration;
    @Max(value = 120, message = "{auth_block.max.size}")
    @NotBlank(message = "{auth.auth_block.blockedReason.required}")
    private String blockedReason;
}
