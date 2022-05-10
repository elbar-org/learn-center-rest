package elbar.company.learn_center_rest.dto.blog.blog_rating;

import elbar.company.learn_center_rest.dto.GenericDTO;
import lombok.*;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BlogRatingGetDTO extends GenericDTO {
    @NotBlank(message = "{blog.blog_rating.blogId.required}")
    private Integer blogId;
    @NotBlank(message = "{blog.blog_rating.views.required}")
    private Integer views;
    @NotBlank(message = "{blog.blog_rating.stars.required}")
    private Integer stars;
}
