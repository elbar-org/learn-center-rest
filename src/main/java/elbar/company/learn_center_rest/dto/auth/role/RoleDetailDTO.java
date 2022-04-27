package elbar.company.learn_center_rest.dto.auth.role;

import com.google.gson.annotations.SerializedName;
import elbar.company.learn_center_rest.dto.GenericDTO;
import lombok.*;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class RoleDetailDTO extends GenericDTO {
    @NotBlank(message = "{auth.role.name.required}")
    private String name;
    @SerializedName(value = "is_published")
    @NotBlank(message = "{auth.role.is_published.required}")
    private Boolean isPublished;
}
