package elbar.company.learn_center_rest.dto.course.course_price;

import elbar.company.learn_center_rest.dto.BaseDTO;
import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CoursePriceCreateDTO implements BaseDTO {
    @NotNull(message = "{course.course.price.course_id.required}")
    private Integer courseId;

    @Size(min = 3, max = 30, message = "{course.course.price.price.size}")
    @NotBlank(message = "{course.course.price.price.required}")
    private String price;

    @NotNull(message = "{course.course.price.discount.required}")
    private Integer discount;
}
