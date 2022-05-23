package elbar.company.learn_center_rest.dto.auth.card;

import elbar.company.learn_center_rest.dto.GenericDTO;
import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CardGetDTO extends GenericDTO {
    private Integer userId;
    private String pan;
    private String type;
    private String holderName;
}
