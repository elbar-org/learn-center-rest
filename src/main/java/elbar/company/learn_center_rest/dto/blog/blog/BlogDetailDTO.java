package elbar.company.learn_center_rest.dto.blog.blog;

import com.google.gson.annotations.SerializedName;
import elbar.company.learn_center_rest.dto.GenericDTO;
import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BlogDetailDTO extends GenericDTO {
    private String title;
    private String description;
    private String content;
    private String image;
    private Integer categoryId;
    private boolean isPublished;
}
