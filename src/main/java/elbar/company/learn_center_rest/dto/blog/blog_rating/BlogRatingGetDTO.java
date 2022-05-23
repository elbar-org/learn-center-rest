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
public class BlogRatingGetDTO extends GenericDTO {
    private Integer blogId;
    private Integer views;
    private Integer stars;
}
