package elbar.company.learn_center_rest.criteria.course.course_price;

import elbar.company.learn_center_rest.criteria.GenericCriteria;
import elbar.company.learn_center_rest.enums.course.course_price.CoursePriceFieldsEnum;
import lombok.Getter;
import lombok.Setter;
import org.springdoc.api.annotations.ParameterObject;

@Getter
@Setter
@ParameterObject
public class CoursePriceCriteria extends GenericCriteria {
    private CoursePriceFieldsEnum fieldsEnum;
}
