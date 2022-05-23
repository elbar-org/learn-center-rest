package elbar.company.learn_center_rest.dto.blog.blog_rating;

import elbar.company.learn_center_rest.dto.GenericDTO;
import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BlogRatingDetailDTO extends GenericDTO {
    @NotNull(message = "{blog.blog_rating.blogId.required}")
    private Integer blogId;
    @NotNull(message = "{blog.blog_rating.views.required}")
    private Integer views;
    @NotNull(message = "{blog.blog_rating.stars.required}")
    private Integer stars;
}
