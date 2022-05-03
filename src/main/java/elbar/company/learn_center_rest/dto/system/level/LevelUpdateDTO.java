package elbar.company.learn_center_rest.dto.system.level;

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
public class LevelUpdateDTO extends GenericDTO {
    @Min(value = 3, message = "{level.min.size}")
    @Max(value = 120, message = "{level.max.size}")
    @NotBlank(message = "{system.level.name.required}")
    private String name;
    @SerializedName(value = "is_published")
    private boolean isPublished;
}
