package elbar.company.learn_center_rest.dto.auth.card_type;

import com.google.gson.annotations.SerializedName;
import elbar.company.learn_center_rest.dto.GenericDTO;
import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CardTypeUpdateDTO extends GenericDTO {
    @NotBlank(message = "{auth.card_type.name.required}")
    @Size(min = 3, max = 120, message = "{auth.card_type.name.length}")
    private String name;
    @SerializedName(value = "is_published")
    private boolean isPublished;
}
