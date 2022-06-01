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
    private Integer userId;
    private Integer courseId;
    private Integer cardId;
    private String amount;
}
