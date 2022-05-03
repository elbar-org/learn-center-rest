package elbar.company.learn_center_rest.dto.system.skill;

import com.google.gson.annotations.SerializedName;
import elbar.company.learn_center_rest.dto.GenericDTO;
import lombok.*;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class SkillGetDTO extends GenericDTO {
    @NotBlank(message = "{system.skill.name.required}")
    private String name;
    @SerializedName(value = "is_published")
    private boolean isPublished;
}
