package elbar.company.learn_center_rest.dto.system.level;

import com.google.gson.annotations.SerializedName;
import elbar.company.learn_center_rest.dto.BaseDTO;
import lombok.*;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class LevelCreateDTO implements BaseDTO {
    @Size(min = 3, max = 120, message = "{system.level.name.length}")
    @NotBlank(message = "{system.level.name.required}")
    private String name;
    @SerializedName(value = "is_published")
    private boolean isPublished;
}
