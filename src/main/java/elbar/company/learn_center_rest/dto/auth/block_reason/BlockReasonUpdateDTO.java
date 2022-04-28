package elbar.company.learn_center_rest.dto.auth.block_reason;

import com.google.gson.annotations.SerializedName;
import elbar.company.learn_center_rest.dto.GenericDTO;
import lombok.*;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BlockReasonUpdateDTO extends GenericDTO {
    @Max(value = 120, message = "{language.max.size}")
    @NotBlank(message = "{auth.block_reason.name.required}")
    private String name;
    @SerializedName(value = "is_published")
    private boolean isPublished;
}