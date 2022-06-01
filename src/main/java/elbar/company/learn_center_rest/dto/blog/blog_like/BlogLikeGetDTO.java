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
public class BlogLikeGetDTO extends GenericDTO {
    private Integer blogId;
    private Integer userId;
}
