package elbar.company.learn_center_rest.dto.auth.block;

import elbar.company.learn_center_rest.dto.BaseDTO;
import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AuthBlockCreateDDTO implements BaseDTO {
    @NotNull(message = "{auth.auth_block.userId.required}")
    private Integer userId;
    @NotNull(message = "{auth.auth_block.duration.required}")
    private String duration;
    @Size(min = 5, max = 120, message = "{auth.auth_block.blockReason.length}")
    @NotBlank(message = "{auth.auth_block.blockedReason.required}")
    private String blockedReason;
}
