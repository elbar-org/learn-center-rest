package elbar.company.learn_center_rest.dto.auth.card;

import elbar.company.learn_center_rest.dto.GenericDTO;
import lombok.*;

import javax.validation.constraints.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CardUpdateDTO extends GenericDTO {
    @NotNull(message = "{auth.card.userId.required}")
    private Integer userId;
    @Size(min = 16, max = 16, message = "{auth.card.pan.length}")
    @NotBlank(message = "{auth.card.pan.required}")
    private String pan;
    @Size(min = 3, max = 120, message = "{auth.card.type.length}")
    @NotBlank(message = "{auth.card.type.required}")
    private String type;
    @Size(min = 5, max = 120, message = "{auth.card.holderName.length}")
    @NotBlank(message = "{auth.card.holderName.required}")
    private String holderName;
}
