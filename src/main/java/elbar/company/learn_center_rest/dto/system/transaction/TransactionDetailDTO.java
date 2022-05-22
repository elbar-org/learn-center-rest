package elbar.company.learn_center_rest.dto.system.transaction;

import elbar.company.learn_center_rest.dto.GenericDTO;
import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class TransactionDetailDTO extends GenericDTO {
    @NotNull(message = "{system.transaction.courseId.required}")
    private Integer courseId;
    @NotNull(message = "{system.transaction.userId.required}")
    private Integer userId;
    @NotNull(message = "{system.transaction.cardId.required}")
    private Integer cardId;
    @NotBlank(message = "{system.transaction.quantity.required}")
    private String quantity;
    @NotBlank(message = "{system.transaction.status.required}")
    private String status;
}
