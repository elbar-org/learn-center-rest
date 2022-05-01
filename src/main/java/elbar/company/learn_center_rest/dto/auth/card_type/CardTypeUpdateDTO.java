package elbar.company.learn_center_rest.dto.auth.card_type;

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
public class CardTypeUpdateDTO extends GenericDTO {
    @Min(value = 3, message = "{card_type.min.size}")
    @Max(value = 120, message = "{card_type.max.size}")
    @NotBlank(message = "{auth.card_type.name.required}")
    private String name;
    @NotBlank(message = "{auth.card_type.is_published.required}")
    private boolean isPublished;
}
