package elbar.company.learn_center_rest.dto.system.tag;

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
public class TagUpdateDTO extends GenericDTO {
    @Min(value = 2, message = "{tag.min.size}")
    @Max(value = 120, message = "{tag.max.size}")
    @NotBlank(message = "{system.tag.name.required}")
    private String name;
    @SerializedName(value = "is_published")
    private boolean isPublished;
}
