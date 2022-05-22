package elbar.company.learn_center_rest.dto.blog.blog_comment;

import elbar.company.learn_center_rest.dto.BaseDTO;
import lombok.*;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BlogCommentCreateDTO implements BaseDTO {
    @Min(value = 1, message = "{blog.blog_comment.blogId.min.size}")
    @NotNull(message = "{blog.blog_comment.blogId.required}")
    private Integer blogId;
    @NotBlank(message = "{blog.blog_comment.message.required}")
    @Size(min = 3, max = 120, message = "{blog.blog_comment.message.size}")
    private String message;
}
