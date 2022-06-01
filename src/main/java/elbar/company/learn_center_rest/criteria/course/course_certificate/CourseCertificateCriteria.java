package elbar.company.learn_center_rest.criteria.course.course_certificate;

import elbar.company.learn_center_rest.criteria.GenericCriteria;
import elbar.company.learn_center_rest.enums.course.course_certificate.CourseCertificateFieldsEnum;
import lombok.Getter;
import lombok.Setter;
import org.springdoc.api.annotations.ParameterObject;

@Getter
@Setter
@ParameterObject
public class CourseCertificateCriteria extends GenericCriteria {
    private CourseCertificateFieldsEnum fieldsEnum;
}
