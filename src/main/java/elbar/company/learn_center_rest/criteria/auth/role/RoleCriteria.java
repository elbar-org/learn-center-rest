package elbar.company.learn_center_rest.criteria.auth.role;

import elbar.company.learn_center_rest.criteria.GenericCriteria;
import elbar.company.learn_center_rest.enums.auth.role.RoleFieldsEnum;
import lombok.Getter;
import lombok.Setter;
import org.springdoc.api.annotations.ParameterObject;
import org.springframework.data.domain.Sort;

@Getter
@Setter
@ParameterObject
public class RoleCriteria extends GenericCriteria {
    private RoleFieldsEnum fieldsEnum;
}
