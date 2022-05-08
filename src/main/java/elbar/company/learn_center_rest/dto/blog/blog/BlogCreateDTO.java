package elbar.company.learn_center_rest.dto.blog.blog;

import com.google.gson.annotations.SerializedName;
import elbar.company.learn_center_rest.dto.BaseDTO;
import lombok.*;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BlogCreateDTO implements BaseDTO {
    @NotBlank(message = "{blog.blog.title.required}")
    @Size(min = 3, max = 120, message = "{blog.blog.title.size}")
    private String title;
    @NotBlank(message = "{blog.blog.description.required}")
    @Size(min = 50, max = 500, message = "{blog.blog.description.size}")
    private String description;
    @NotBlank(message = "{blog.blog.content.required}")
    @Size(min = 250, message = "{blog.blog.content.size}")
    private String content;
    @NotBlank(message = "{blog.blog.image.required}")
    @Size(min = 8, message = "{blog.blog.image.size}")
    private String image;
    @Min(value = 1, message = "{blog.min.size}")
    @NotBlank(message = "{blog.blog.categoryId.required}")
    private Integer categoryId;
    @SerializedName(value = "is_published")
    private boolean isPublished;
}
