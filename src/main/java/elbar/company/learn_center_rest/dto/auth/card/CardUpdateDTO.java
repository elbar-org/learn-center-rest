package elbar.company.learn_center_rest.dto.auth.card;

import elbar.company.learn_center_rest.dto.GenericDTO;
import lombok.*;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CardUpdateDTO extends GenericDTO {
    @NotBlank(message = "{auth.card.userId.required}")
    private Integer userId;
    @Min(value = 4, message = "{card.min.size}")
    @Max(value = 120, message = "{card.max.size}")
    @NotBlank(message = "{auth.card.pan.required}")
    private String pan;
    @Min(value = 2, message = "{card.min.size}")
    @Max(value = 120, message = "{card.max.size}")
    @NotBlank(message = "{auth.card.type.required}")
    private String type;
    @Min(value = 12, message = "{card.min.size}")
    @Max(value = 120, message = "{card.max.size}")
    @NotBlank(message = "{auth.card.holderName.required}")
    private String holderName;
}
