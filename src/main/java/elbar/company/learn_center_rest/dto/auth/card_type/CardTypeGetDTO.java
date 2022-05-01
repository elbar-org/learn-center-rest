package elbar.company.learn_center_rest.dto.auth.card_type;

import elbar.company.learn_center_rest.dto.GenericDTO;
import lombok.*;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CardTypeGetDTO extends GenericDTO {
    @NotBlank(message = "{auth.card_type.name.required}")
    private String name;
    @NotBlank(message = "{auth.card_type.is_published.required}")
    private boolean isPublished;
}
