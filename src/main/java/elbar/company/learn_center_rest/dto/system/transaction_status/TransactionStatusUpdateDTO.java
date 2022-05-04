package elbar.company.learn_center_rest.dto.system.transaction_status;

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
public class TransactionStatusUpdateDTO extends GenericDTO {
    @Min(value = 3, message = "{transaction_status.min.size}")
    @Max(value = 120, message = "{transaction_status.max.size}")
    @NotBlank(message = "{system.transaction_status.name.required}")
    private String name;
    @SerializedName(value = "is_published")
    private boolean isPublished;
}
