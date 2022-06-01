package elbar.company.learn_center_rest.criteria.auth.user;

import elbar.company.learn_center_rest.criteria.GenericCriteria;
import elbar.company.learn_center_rest.enums.auth.user.AuthUserFieldsEnum;
import lombok.Getter;
import lombok.Setter;
import org.springdoc.api.annotations.ParameterObject;
import org.springframework.data.domain.Sort;

@Getter
@Setter
@ParameterObject
public class AuthUserCriteria extends GenericCriteria {
    private AuthUserFieldsEnum fieldsEnum;
}
