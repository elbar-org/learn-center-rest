package elbar.company.learn_center_rest.dto.system.transaction;

import elbar.company.learn_center_rest.dto.GenericDTO;
import lombok.*;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class TransactionGetDTO extends GenericDTO {
    @NotBlank(message = "{system.transaction.courseId.required}")
    private Integer courseId;
    @NotBlank(message = "{system.transaction.userId.required}")
    private Integer userId;
    @NotBlank(message = "{system.transaction.cardId.required}")
    private Integer cardId;
    @NotBlank(message = "{system.transaction.quantity.required}")
    private String quantity;
    @NotBlank(message = "{system.transaction.status.required}")
    private String status;
}
