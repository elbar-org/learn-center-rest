package elbar.company.learn_center_rest.dto.course.course;

import elbar.company.learn_center_rest.dto.BaseDTO;
import lombok.*;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CourseCreateDTO implements BaseDTO {
    @NotBlank(message = "{course.course.title.required}")
    @Size(min = 3, max = 120, message = "{course.course.title.length}")
    private String title;

    @NotBlank(message = "{course.course.description.required}")
    @Size(min = 12, max = 300, message = "{course.course.description.length}")
    private String description;

    @NotBlank(message = "{course.course.content.required}")
    @Min(value = 25, message = "{course.course.content.length}")
    private String content;

    @NotBlank(message = "{course.course.image.required}")
    @Min(value = 10, message = "{course.course.image.length}")
    private String image;

    @NotNull(message = "{course.course.categoryId.required}")
    private Integer categoryId;

    @NotNull(message = "{course.course.isPublished.required}")
    private Boolean isPublished;
}
