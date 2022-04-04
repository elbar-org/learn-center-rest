package elbar.company.learn_center_rest.dto.auth.language;

import elbar.company.learn_center_rest.dto.GenericDTO;
import lombok.*;

import javax.validation.constraints.Min;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class LanguageGetDTO extends GenericDTO {
    private String name;
    private Boolean is_published;
}
