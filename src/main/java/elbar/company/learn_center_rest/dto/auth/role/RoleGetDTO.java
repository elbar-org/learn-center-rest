package elbar.company.learn_center_rest.dto.auth.role;

import com.google.gson.annotations.SerializedName;
import elbar.company.learn_center_rest.dto.GenericDTO;
import lombok.*;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class RoleGetDTO extends GenericDTO {
    private String name;
    private Boolean isPublished;
}
