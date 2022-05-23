package elbar.company.learn_center_rest.dto.auth.card_type;

import elbar.company.learn_center_rest.dto.GenericDTO;
import lombok.*;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CardTypeDetailDTO extends GenericDTO {
    private String name;
    private boolean isPublished;
}
