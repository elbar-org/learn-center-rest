package elbar.company.learn_center_rest.dto.blog.blog;

import com.google.gson.annotations.SerializedName;
import elbar.company.learn_center_rest.dto.GenericDTO;
import lombok.*;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BlogDetailDTO extends GenericDTO {
    @NotBlank(message = "{blog.blog.title.required}")
    private String title;
    @NotBlank(message = "{blog.blog.description.required}")
    private String description;
    @NotBlank(message = "{blog.blog.content.required}")
    private String content;
    @NotBlank(message = "{blog.blog.image.required}")
    private String image;
    @NotBlank(message = "{blog.blog.categoryId.required}")
    private Integer categoryId;
    @SerializedName(value = "is_published")
    private boolean isPublished;
}
