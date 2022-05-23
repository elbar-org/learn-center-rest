package elbar.company.learn_center_rest.dto.system.transaction_status;

import com.google.gson.annotations.SerializedName;
import elbar.company.learn_center_rest.dto.BaseDTO;
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
public class TransactionStatusCreateDTO implements BaseDTO {
    @Size(min = 3, max = 120, message = "{system.transaction_status.name.length}")
    @NotBlank(message = "{system.transaction_status.name.required}")
    private String name;
    @SerializedName(value = "is_published")
    private boolean isPublished;
}
