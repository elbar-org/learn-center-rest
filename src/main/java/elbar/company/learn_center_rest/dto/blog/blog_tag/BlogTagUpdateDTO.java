package elbar.company.learn_center_rest.dto.blog.blog_tag;

import elbar.company.learn_center_rest.dto.GenericDTO;
import lombok.*;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BlogTagUpdateDTO extends GenericDTO {
    @Min(value = 1, message = "{blog_tag.min.size}")
    @NotBlank(message = "{blog.blog_tag.blogId.required}")
    private Integer blogId;
    @Min(value = 1, message = "{blog_tag.min.size}")
    @NotBlank(message = "{blog.blog_tag.tagId.required}")
    private Integer tagId;
}
