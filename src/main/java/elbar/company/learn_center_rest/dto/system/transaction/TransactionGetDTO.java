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
public class TransactionGetDTO extends GenericDTO {
    private Integer courseId;
    private Integer userId;
    private Integer cardId;
    private String quantity;
    private String status;
}
