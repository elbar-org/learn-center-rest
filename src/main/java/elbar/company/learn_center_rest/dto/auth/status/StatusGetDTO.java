package elbar.company.learn_center_rest.dto.auth.status;

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
public class StatusGetDTO extends GenericDTO {
    private String name;
    private Boolean isPublished;
}
