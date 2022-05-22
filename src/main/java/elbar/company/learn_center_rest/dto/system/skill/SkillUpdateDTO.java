package elbar.company.learn_center_rest.dto.system.skill;

import com.google.gson.annotations.SerializedName;
import elbar.company.learn_center_rest.dto.GenericDTO;
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
public class SkillUpdateDTO extends GenericDTO {
    @Size(min = 2, max = 120, message = "{system.skill.name.length}")
    @NotBlank(message = "{system.skill.name.required}")
    private String name;
    @SerializedName(value = "is_published")
    private boolean isPublished;
}
