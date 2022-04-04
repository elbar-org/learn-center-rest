package elbar.company.learn_center_rest.dto.blog.blog_category;

import com.google.gson.annotations.SerializedName;
import elbar.company.learn_center_rest.dto.GenericDTO;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class BlogCategoryGetDTO extends GenericDTO {
    private String title;

    private String description;

    @SerializedName(value = "is_published")
    private Boolean isPublished;
}
