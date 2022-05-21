package elbar.company.learn_center_rest.criteria.course.course_category;

import elbar.company.learn_center_rest.criteria.GenericCriteria;
import elbar.company.learn_center_rest.enums.course.course_category.CourseCategoryFieldsEnum;
import lombok.Getter;
import lombok.Setter;
import org.springdoc.api.annotations.ParameterObject;

@Getter
@Setter
@ParameterObject
public class CourseCategoryCriteria extends GenericCriteria {
    private CourseCategoryFieldsEnum fieldsEnum;
}
