package elbar.company.learn_center_rest.dto.blog.blog_rating;

import elbar.company.learn_center_rest.dto.BaseDTO;
import lombok.*;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BlogRatingCreateDTO implements BaseDTO {
    @Min(value = 1, message = "{blog_rating.min.size}")
    @NotNull(message = "{blog.blog_rating.blogId.required}")
    private Integer blogId;
    @Min(value = 1, message = "{blog_rating.min.size}")
    @NotNull(message = "{blog.blog_rating.views.required}")
    private Integer views;
    @Min(value = 1, message = "{blog_rating.min.size}")
    @NotNull(message = "{blog.blog_rating.stars.required}")
    private Integer stars;
}
