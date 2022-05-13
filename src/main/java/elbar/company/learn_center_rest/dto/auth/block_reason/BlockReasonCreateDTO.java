package elbar.company.learn_center_rest.dto.auth.block_reason;

import com.google.gson.annotations.SerializedName;
import elbar.company.learn_center_rest.dto.BaseDTO;
import lombok.*;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BlockReasonCreateDTO implements BaseDTO {
    @Max(value = 120, message = "{block_reason.max.size}")
    @NotBlank(message = "{auth.block_reason.name.required}")
    private String name;
    @SerializedName(value = "is_published")
    private boolean isPublished;
}
