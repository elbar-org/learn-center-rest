package elbar.company.learn_center_rest.dto.auth.card;

import elbar.company.learn_center_rest.dto.GenericDTO;
import lombok.*;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CardGetDTO extends GenericDTO {
    @NotBlank(message = "{auth.card.userId.required}")
    private Integer userId;
    @NotBlank(message = "{auth.card.pan.required}")
    private String pan;
    @NotBlank(message = "{auth.card.type.required}")
    private String type;
    @NotBlank(message = "{auth.card.holderName.required}")
    private String holderName;
}
