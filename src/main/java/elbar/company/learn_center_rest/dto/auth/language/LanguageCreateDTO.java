package elbar.company.learn_center_rest.dto.auth.language;

import com.google.gson.annotations.SerializedName;
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
    @NotBlank(message = "{auth.language.name.required}")
    private String name;
    @SerializedName(value = "is_published")
    @NotBlank(message = "{auth.language.is_published.required}")
    private boolean isPublished;
}
