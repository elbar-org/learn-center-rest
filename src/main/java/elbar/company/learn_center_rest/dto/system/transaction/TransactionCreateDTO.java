package elbar.company.learn_center_rest.dto.system.transaction;

import elbar.company.learn_center_rest.dto.BaseDTO;
import lombok.*;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class TransactionCreateDTO implements BaseDTO {
    @NotBlank(message = "{system.transaction.courseId.required}")
    private Integer courseId;
    @NotBlank(message = "{system.transaction.userId.required}")
    private Integer userId;
    @NotBlank(message = "{system.transaction.cardId.required}")
    private Integer cardId;
    @Min(value = 4, message = "{transaction.min.size}")
    @Max(value = 30, message = "{transaction.max.size}")
    @NotBlank(message = "{system.transaction.quantity.required}")
    private String quantity;
    @Min(value = 3, message = "{transaction.min.size}")
    @Max(value = 120, message = "{transaction.max.size}")
    @NotBlank(message = "{system.transaction.status.required}")
    private String status;
}
