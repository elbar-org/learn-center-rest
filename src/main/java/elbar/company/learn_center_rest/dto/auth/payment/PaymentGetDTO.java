package elbar.company.learn_center_rest.dto.auth.payment;

import elbar.company.learn_center_rest.dto.GenericDTO;
import lombok.*;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PaymentGetDTO extends GenericDTO {
    @NotBlank(message = "{auth.payment.userId.required}")
    private Integer userId;
    @NotBlank(message = "{auth.payment.courseId.required}")
    private Integer courseId;
    @NotBlank(message = "{auth.payment.cardId.required}")
    private Integer cardId;
    @NotBlank(message = "{auth.payment.amount.required}")
    private String amount;
}
