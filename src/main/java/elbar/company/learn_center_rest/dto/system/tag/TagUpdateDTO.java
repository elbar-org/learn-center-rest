package elbar.company.learn_center_rest.dto.system.tag;

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
public class TagUpdateDTO extends GenericDTO {
    @Size(min = 2, max = 120, message = "{system.tag.name.length}")
    @NotBlank(message = "{system.tag.name.required}")
    private String name;
    @SerializedName(value = "is_published")
    private boolean isPublished;
}
