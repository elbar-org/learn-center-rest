package elbar.company.learn_center_rest.dto.auth.role;

import com.google.gson.annotations.SerializedName;
import elbar.company.learn_center_rest.dto.GenericDTO;
import lombok.*;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class RoleUpdateDTO extends GenericDTO {
    @Min(value = 2, message = "{role.min.size}")
    @Max(value = 30, message = "{role.max.size}")
    @NotBlank(message = "{auth.role.name.required}")
    private String name;
    @SerializedName(value = "is_published")
    @NotBlank(message = "{auth.role.is_published.required}")
    private Boolean isPublished;
}
