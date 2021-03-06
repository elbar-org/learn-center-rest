package elbar.company.learn_center_rest.dto.system.faq;

import com.google.gson.annotations.SerializedName;
import elbar.company.learn_center_rest.dto.BaseDTO;
import lombok.*;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class FaqCreateDTO implements BaseDTO {
    @NotBlank(message = "{system.faq.question.required}")
    private String question;
    @NotBlank(message = "{system.faq.answer.required}")
    private String answer;
    @SerializedName(value = "is_published")
    private boolean isPublished;
}
