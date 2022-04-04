package elbar.company.learn_center_rest.dto.auth.language;

import elbar.company.learn_center_rest.dto.BaseDTO;
import lombok.*;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class LanguageCreateDTO implements BaseDTO {
    @Min(value = 2, message = "{language.min.size}")
    @Max(value = 3, message = "{language.max.size}")
    @NotBlank(message = "{language.name.required}")
    private String name;
}
