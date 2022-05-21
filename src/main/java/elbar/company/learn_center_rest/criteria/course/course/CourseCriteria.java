package elbar.company.learn_center_rest.criteria.course.course;

import elbar.company.learn_center_rest.criteria.GenericCriteria;
import elbar.company.learn_center_rest.enums.course.course.CourseFieldsEnum;
import lombok.Getter;
import lombok.Setter;
import org.springdoc.api.annotations.ParameterObject;

@Getter
@Setter
@ParameterObject
public class CourseCriteria extends GenericCriteria {
    private CourseFieldsEnum fieldsEnum;
}
