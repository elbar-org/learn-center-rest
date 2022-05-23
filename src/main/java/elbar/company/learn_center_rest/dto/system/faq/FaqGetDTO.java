package elbar.company.learn_center_rest.dto.system.faq;

import com.google.gson.annotations.SerializedName;
import elbar.company.learn_center_rest.dto.GenericDTO;
import lombok.*;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class FaqGetDTO extends GenericDTO {
    private String question;
    private String answer;
    @SerializedName(value = "is_published")
    private boolean isPublished;
}
