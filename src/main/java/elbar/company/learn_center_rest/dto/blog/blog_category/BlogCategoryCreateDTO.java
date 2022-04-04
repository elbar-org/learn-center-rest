package elbar.company.learn_center_rest.dto.blog.blog_category;

import com.google.gson.annotations.SerializedName;
import elbar.company.learn_center_rest.dto.BaseDTO;
import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class BlogCategoryCreateDTO implements BaseDTO {
    @NotBlank(message = "{blog.category.title.required}")
    @Size(min = 3, max = 120, message = "{blog.category.title.size}")
    private String title;

    @NotBlank(message = "{blog.category.description.required}")
    @Size(min = 3, max = 120, message = "{blog.category.description.size}")
    private String description;

    @SerializedName(value = "is_published")
    private boolean isPublished;
}
