package elbar.company.learn_center_rest.dto.system.skill;

import com.google.gson.annotations.SerializedName;
import elbar.company.learn_center_rest.dto.BaseDTO;
import lombok.*;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class SkillCreateDTO implements BaseDTO {
    @Min(value = 2, message = "{skill.min.size}")
    @Max(value = 120, message = "{skill.max.size}")
    @NotBlank(message = "{system.skill.name.required}")
    private String name;
    @SerializedName(value = "is_published")
    private boolean isPublished;
}
