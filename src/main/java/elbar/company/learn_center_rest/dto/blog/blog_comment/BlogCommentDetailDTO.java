package elbar.company.learn_center_rest.dto.blog.blog_comment;

import elbar.company.learn_center_rest.dto.GenericDTO;
import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BlogCommentDetailDTO extends GenericDTO {
    private Integer blogId;
    private String message;
}
