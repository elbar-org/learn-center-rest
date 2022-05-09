package elbar.company.learn_center_rest.dto.blog.blog_like;

import elbar.company.learn_center_rest.dto.GenericDTO;
import lombok.*;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BlogLikeUpdateDTO extends GenericDTO {
    @Min(value = 1, message = "{blog.min.size}")
    @NotBlank(message = "{blog.blog_like.blogId.required}")
    private Integer blogId;
    @Min(value = 1, message = "{blog.min.size}")
    @NotBlank(message = "{blog.blog_like.userId.required}")
    private Integer userId;
}
