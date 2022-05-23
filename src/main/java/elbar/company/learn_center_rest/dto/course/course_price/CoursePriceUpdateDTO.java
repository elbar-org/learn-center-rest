package elbar.company.learn_center_rest.dto.course.course_price;

import elbar.company.learn_center_rest.dto.GenericDTO;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CoursePriceUpdateDTO extends GenericDTO {
    private Integer courseId;

    private String price;

    private Integer discount;
}
