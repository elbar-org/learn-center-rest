package elbar.company.learn_center_rest.dto.blog.blog_tag;

import elbar.company.learn_center_rest.dto.GenericDTO;
import lombok.*;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BlogTagGetDTO extends GenericDTO {
    @NotNull(message = "{blog.blog_tag.blogId.required}")
    private Integer blogId;
    @NotNull(message = "{blog.blog_tag.tagId.required}")
    private Integer tagId;
}
