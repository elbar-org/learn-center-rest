package elbar.company.learn_center_rest.dto.auth.block_reason;

import com.google.gson.annotations.SerializedName;
import elbar.company.learn_center_rest.dto.BaseDTO;
import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BlockReasonCreateDTO implements BaseDTO {
    @NotBlank(message = "{auth.block_reason.name.required}")
    @Size(min = 3, max = 120, message = "{auth.block_reason.name.length}")
    private String name;
    @SerializedName(value = "is_published")
    private boolean isPublished;
}
