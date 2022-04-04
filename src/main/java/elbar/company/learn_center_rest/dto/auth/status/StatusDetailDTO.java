package elbar.company.learn_center_rest.dto.auth.status;

import com.google.gson.annotations.SerializedName;
import elbar.company.learn_center_rest.dto.GenericDTO;
import lombok.*;
import javax.validation.constraints.NotBlank;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class StatusDetailDTO extends GenericDTO {
    @NotBlank(message = "{auth.status.name.required}")
    private String name;
    @SerializedName(value = "is_published")
    @NotBlank(message = "{auth.status.is_published.required}")
    private Boolean isPublished;
}
