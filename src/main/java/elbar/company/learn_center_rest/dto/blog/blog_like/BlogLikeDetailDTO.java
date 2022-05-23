package elbar.company.learn_center_rest.dto.blog.blog_like;

import elbar.company.learn_center_rest.dto.GenericDTO;
import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BlogLikeDetailDTO extends GenericDTO {
    @NotNull(message = "{blog.blog_like.blogId.required}")
    private Integer blogId;
    @NotNull(message = "{blog.blog_like.userId.required}")
    private Integer userId;
}
