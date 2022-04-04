package elbar.company.learn_center_rest.dto.auth.language;

import elbar.company.learn_center_rest.dto.GenericDTO;
import lombok.*;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class LanguageUpdateDTO extends GenericDTO {
    @Min(value = 2, message = "{language.min.size}")
    @NotBlank(message = "{language.name.required}")
    private String name;
    @NotBlank(message = "{language.is_published.required}")
    private Boolean is_published;
}
