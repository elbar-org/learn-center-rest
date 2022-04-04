package elbar.company.learn_center_rest.dto.auth.language;

import elbar.company.learn_center_rest.dto.GenericDTO;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class LanguageDetailDTO extends GenericDTO {
    private String name;
    private Boolean is_published;
}
