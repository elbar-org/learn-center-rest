package elbar.company.learn_center_rest.dto.blog.blog_rating;

import elbar.company.learn_center_rest.dto.GenericDTO;
import lombok.*;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BlogRatingUpdateDTO extends GenericDTO {
    @Min(value = 1, message = "{blog_rating.min.size}")
    @NotBlank(message = "{blog.blog_rating.blogId.required}")
    private Integer blogId;
    @Min(value = 1, message = "{blog_rating.min.size}")
    @NotBlank(message = "{blog.blog_rating.views.required}")
    private Integer views;
    @Min(value = 1, message = "{blog_rating.min.size}")
    @NotBlank(message = "{blog.blog_rating.stars.required}")
    private Integer stars;
}
