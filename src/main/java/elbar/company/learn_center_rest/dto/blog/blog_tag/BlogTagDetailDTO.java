package elbar.company.learn_center_rest.dto.blog.blog_tag;

import elbar.company.learn_center_rest.dto.GenericDTO;
import lombok.*;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BlogTagDetailDTO extends GenericDTO {
    @NotBlank(message = "{blog.blog_tag.blogId.required}")
    private Integer blogId;
    @NotBlank(message = "{blog.blog_tag.tagId.required}")
    private Integer tagId;
}
