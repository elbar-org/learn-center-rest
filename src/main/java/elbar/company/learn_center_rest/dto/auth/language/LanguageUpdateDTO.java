package elbar.company.learn_center_rest.dto.auth.language;

import com.google.gson.annotations.SerializedName;
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
    @Min(value = 2, message = "{auth.language.min.size}")
    @NotBlank(message = "{auth.language.name.required}")
    private String name;
    @NotBlank(message = "{auth.language.is_published.required}")
    @SerializedName(value = "is_published")
    private Boolean isPublished;
}
