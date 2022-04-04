package elbar.company.learn_center_rest.dto.auth.language;

import com.google.gson.annotations.SerializedName;
import elbar.company.learn_center_rest.dto.GenericDTO;
import lombok.*;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class LanguageDetailDTO extends GenericDTO {
    @NotBlank(message = "{auth.language.name.required}")
    private String name;
    @SerializedName(value = "is_published")
    private Boolean isPublished;
}
