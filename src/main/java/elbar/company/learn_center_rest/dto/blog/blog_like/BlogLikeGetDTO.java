package elbar.company.learn_center_rest.dto.blog.blog_like;

import elbar.company.learn_center_rest.dto.GenericDTO;
import lombok.*;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BlogLikeGetDTO extends GenericDTO {
    @NotBlank(message = "{blog.blog_like.blogId.required}")
    private Integer blogId;
    @NotBlank(message = "{blog.blog_like.userId.required}")
    private Integer userId;
}
