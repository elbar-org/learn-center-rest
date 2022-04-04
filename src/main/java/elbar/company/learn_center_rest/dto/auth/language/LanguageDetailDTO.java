package elbar.company.learn_center_rest.dto.auth.language;

import com.google.gson.annotations.SerializedName;
import elbar.company.learn_center_rest.dto.GenericDTO;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class LanguageDetailDTO extends GenericDTO {
    private String name;
    @SerializedName(value = "is_published")
    private Boolean isPublished;
}
