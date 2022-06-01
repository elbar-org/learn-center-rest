package elbar.company.learn_center_rest.criteria.auth.status;

import elbar.company.learn_center_rest.criteria.GenericCriteria;
import elbar.company.learn_center_rest.enums.auth.status.StatusFieldsEnum;
import lombok.Getter;
import lombok.Setter;
import org.springdoc.api.annotations.ParameterObject;
import org.springframework.data.domain.Sort;

@Getter
@Setter
@ParameterObject
public class StatusCriteria extends GenericCriteria {
    private StatusFieldsEnum fieldsEnum;
}
