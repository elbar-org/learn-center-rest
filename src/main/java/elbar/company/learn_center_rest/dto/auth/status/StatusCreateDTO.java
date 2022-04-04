package elbar.company.learn_center_rest.dto.auth.status;

import com.google.gson.annotations.SerializedName;
import elbar.company.learn_center_rest.dto.BaseDTO;
import lombok.*;

import javax.persistence.Column;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class StatusCreateDTO implements BaseDTO {
    @Min(value = 3, message = "{status.min.size}")
    @Max(value = 30, message = "{status.max.size}")
    @NotBlank(message = "{auth.status.name.required}")
    private String name;
    @SerializedName(value = "is_published")
    private boolean isPublished;
}
